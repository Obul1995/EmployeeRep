import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(protected httpClient: HttpClient) { }
  createEmplyee(firstName: string, lastName: string, dob:string, gender: string, department:string): Observable<any> {
    const headers = new HttpHeaders({'cache-request': 'true', 'Content-Type': 'application/json'});
    const req={
      firstName: firstName,
      lastName:lastName,
      gender:gender,
      dob:dob,
      department:department
    }
    return this.httpClient.post<any>('api/createEmployee', req,{headers});
  }

  getEmployeeList(): Observable<any> {
    const headers = new HttpHeaders({'cache-request': 'true', 'Content-Type': 'application/json'});
    return this.httpClient.get('api/getEmployee', {headers});
  }
}
