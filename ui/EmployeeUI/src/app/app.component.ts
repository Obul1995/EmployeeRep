import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor (protected router: Router) {

  }
  ngOnInit(){
  }

  onClickRegistration() {
    this.router.navigate(['registration']);
  }
  onClickList() {
    this.router.navigate(['employeeList']);
  }
}
