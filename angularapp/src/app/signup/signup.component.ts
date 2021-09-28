import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  userFirstname:string;
  userLastname:string;
  userid:string;
  password:string;
  
  constructor() { }

  ngOnInit(): void {
  }

}
