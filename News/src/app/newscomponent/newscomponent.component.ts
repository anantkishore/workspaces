import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-newscomponent',
  templateUrl: './newscomponent.component.html',
  styleUrls: ['./newscomponent.component.css']
})

export class NewscomponentComponent implements OnInit {

  response: any;
  topic: string = "";

  constructor(private http: HttpClient) { }

  ngOnInit() {

    this.http.get('http://fivethingsserver.herokuapp.com/news/102')
    .subscribe((response) => 
    {
      this.response = response;
      console.log(response);
    });
    
  }
  load()
  {
    this.http.get('http://fivethingsserver.herokuapp.com/news/102')
    .subscribe((response) => 
    {
      this.response = response;
      console.log(this.topic);
    });
  }

}
