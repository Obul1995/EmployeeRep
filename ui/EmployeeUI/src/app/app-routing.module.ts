import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import {EmployeeRegistrationComponent} from './Components/employee-registration/employee-registration.component';
import {EmployeeListComponent} from './Components/employee-list/employee-list.component';

const routes: Routes = [
  { path: 'registration', component: EmployeeRegistrationComponent },
  { path: 'employeeList', component: EmployeeListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponets = [EmployeeRegistrationComponent,EmployeeListComponent]