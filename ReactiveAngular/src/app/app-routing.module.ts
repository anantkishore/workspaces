import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CustomerCreateComponent } from './customers/customer-create/create-customer.component';
import { CustomerListComponent } from './customers/customer-list/customer-list.component';
import { CustomersSearchComponent } from './customers/customer-search/customer-search.component';

const routes: Routes = [
  { path: '', redirectTo: 'customers', pathMatch: 'full' },
  { path: 'customers', component: CustomerListComponent },
  { path: 'add', component: CustomerCreateComponent },
  { path: 'search', component: CustomersSearchComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
