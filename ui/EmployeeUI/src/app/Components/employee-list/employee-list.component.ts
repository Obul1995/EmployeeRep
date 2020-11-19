import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/service/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees = [];

  constructor(protected employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.employeeService.getEmployeeList().subscribe(
      response => {
        this.employees=response;
      }
      );
  }

}
