import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule ,routingComponets} from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http'
import { EmployeeRegistrationComponent } from './Components/employee-registration/employee-registration.component';
import { EmployeeListComponent } from './Components/employee-list/employee-list.component';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {TableModule} from 'primeng/table';
import { EmployeeService } from 'src/service/employee.service';


@NgModule({
  declarations: [
    AppComponent,
    routingComponets,
    EmployeeListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    TableModule
  ],
  providers: [EmployeeService],
  entryComponents: [EmployeeRegistrationComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
