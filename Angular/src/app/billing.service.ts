import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BillingService {

  constructor(private http :HttpClient) { }
  // header =new  HttpHeaders().set("Access-Control-Allow-Origin","*").set('content-type','application/json')

  save(data){
    
    return this.http.post('http://localhost:8080/addBilling',data);
  }

  getAreas(){
    
    return this.http.get('http://localhost:8080/getAreas');
  }

  

  getBillings(){
    
    return this.http.get('http://localhost:8080/getBilling');
  }
}
