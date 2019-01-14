import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { DepartmentListComponent } from '../department-list/department-list.component';
import { EmployeeListComponent } from '../employee-list/employee-list.component';

const routes: Routes =  [
  { path: 'departments', component: DepartmentListComponent},
  { path: 'employees', component: EmployeeListComponent}
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  declarations: []
})

export class AppRoutingModule { }

export const routingComponents = [ DepartmentListComponent, EmployeeListComponent ]
