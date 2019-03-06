import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addform',
  templateUrl: './addform.component.html',
  styleUrls: ['./addform.component.css']
})
export class AddformComponent implements OnInit {
  form: any = {};

  constructor() { }

  ngOnInit() {
  }

  onSubmit() {
   console.log(this.form);
  }

}
