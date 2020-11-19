import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { EmployeeService } from 'src/service/employee.service';

@Component({
  selector: 'app-employee-registration',
  templateUrl: './employee-registration.component.html',
  styleUrls: ['./employee-registration.component.css']
})
export class EmployeeRegistrationComponent implements OnInit {

  form = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    gender: new FormControl(''),
    dob: new FormControl(''),
    department: new FormControl('')
  });
  create = true;
  mandatoryCheck = false;
  constructor(protected employeeService: EmployeeService) { }

  ngOnInit(): void {
  }
  onClickRegistration() {
    const dateOfBirth = this.form.get('dob');
    let dobValue = dateOfBirth?.value;
    if (dobValue !== '') {
      var splitDate = dobValue.split('-');
      var year = splitDate[0];
      var month = splitDate[1];
      var day = splitDate[2];
      dobValue = month + "-" + day + "-" + year;
    }
    const firstName = this.form.get('firstName')?.value;
    const lastName = this.form.get('lastName')?.value;
    const gender = this.form.get('gender')?.value;
    const department = this.form.get('department')?.value;

    this.employeeService.createEmplyee(firstName, lastName, dobValue, gender, department).subscribe(
      response => {
        this.create = false;
        this.mandatoryCheck = false;
        this.setDefault();

      }
    );

  }

  setDefault() {
    setTimeout(() => {
      this.create = true;
      this.form.get('firstName')?.setValue('');
      this.form.get('lastName')?.setValue('');
      this.form.get('gender')?.setValue('');
      this.form.get('department')?.setValue('');
      this.form.get('dob')?.setValue('');
    }, 800);
  }



  onNameChange(): void {
    const value = this.form.get('firstName')?.value;
    if (value.length > 0) {
      this.mandatoryCheck = true;
    } else {
      this.mandatoryCheck = false;
    }
  }
}

