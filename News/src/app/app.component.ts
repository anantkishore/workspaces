import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'News';
  userName: string = "";

  constructor( private http: HttpClient)
  {
      //this.svc.printToConsole("Got the Service! ");
  }

  ngOnInit() {
    //let obs = this.http.get('http://fivethingsserver.herokuapp.com/news/102');
    //bs.subscribe((response) => console.log(response)
    //);
  }

}
