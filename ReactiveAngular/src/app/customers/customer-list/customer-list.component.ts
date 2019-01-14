import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

import { CustomerService } from '../customer.service';
import { Customer } from '../customer';

@Component({
    selector: 'app-customerlist',
    templateUrl: './customer-list.component.html',
    styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

    customers: Observable<Customer[]>;

    constructor(private customerService: CustomerService, private router: Router) {}

    ngOnInit() {
        this.reloadData();
    }

    deleteCustomers() {
        this.customerService.deleteAll()
        .subscribe(
            data => {
                console.log(data);
                this.navigateToAdd();
            },
            error => console.log('Error: ', error)
        );
    }

    reloadData() {
        this.customers = this.customerService.getCustomerList();
    }

    navigateToAdd() {
        this.router.navigate(['add']);
    }
}
