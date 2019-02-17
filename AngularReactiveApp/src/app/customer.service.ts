import { Injectable, Inject } from '@angular/core';
import { HttpClient, HttpRequest } from '@angular/common/http';
import * as EventSource from 'eventsource';

import { Customer } from './customer';
import { Observable } from 'rxjs';

@Injectable()
export class CustomerService {

    private baseUrl = 'http://localhost:8080/api/customers';

    private customerList: Customer[] = new Array();

    private customerListSearch: Customer[] = new Array();

    constructor(private http: HttpClient){
    }

    createCustomer(customer: Object): Observable<Object> {
        return this.http.post('${this.baseUrl}' + '/create', customer);
    }

    updateCustomer(id: string, value: any): Observable<Object> {
        return this.http.put('${this.baseUrl}/${id}', value);
    }

    deleteCustomer(id: string): Observable<any> {
        return this.http.delete('${this.baseUrl}/${id}', { responseType: 'text'});
    }

    getCustomerList(): Observable<any> {
        this.customerList = new Array();

        return Observable.create((observer: any ) => {
            const eventSource = new EventSource('${this.baseUrl}');
            eventSource.onmessage = (event) => {
                console.log('eventSource.onmessage: ', event);
                const json = JSON.parse(event.data);
                this.customerList.push(new Customer(json['id'], json['name'], json['age'], json['active']));
                observer.next(this.customerList);
            };

            eventSource.onerror = (error: any) => observer.error('eventSource.onerror: ', error);

            return () => eventSource.close();

        });
    }

    deleteAll(): Observable<any> {
        return this.http.delete('${this.baseUrl}' + '/delete', { responseType: 'text'});
    }

    findCustomers(name: string): Observable<any> {
        this.customerListSearch = new Array();

        return Observable.create((observer: any) => {
            const eventSource = new EventSource('${this.baseUrl}' + '/findByName?name=' + name);

            eventSource.onmessage = event => {

                console.log('eventSource.onmessage: ', event);
                const json = JSON.parse(event.data);
                this.customerListSearch.push(new Customer(json['id'], json['name'], json['age'], json['active']));
                observer.next(this.customerListSearch);
            };

            eventSource.onerror = (error: any) => observer.error('eventSource.onerror', error);

            return () => eventSource.close();
        });
    }

}