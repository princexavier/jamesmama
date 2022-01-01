import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ViewreportService {
  apiUrl:string="http://localhost:8080/viewbydate"
  constructor(private http:HttpClient) { }

  viewbyDate(dateCreated){
    return this.http.post(this.apiUrl,dateCreated);
  }

}
