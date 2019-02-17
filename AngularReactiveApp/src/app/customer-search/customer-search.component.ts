import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { CustomerService } from '../customer.service';
import { Customer } from '../customer';

@Component({
    selector: 'app-customersearch',
    templateUrl: './customer-search.component.html',
    styleUrls: ['./customer-search.component.css']
})
export class CustomerSearchComponent implements OnInit {

    customers: Observable<Customer[]>;
    name: string;

    constructor(private customerService: CustomerService) { }

    ngOnInit() {
      this.name = '';
    }

    search() {
      this.customers = this.customerService.findCustomers(this.name);
    }
}
