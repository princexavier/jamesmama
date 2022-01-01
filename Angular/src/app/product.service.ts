import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  apiUrl:string="http://localhost:8080"
  constructor(private http : HttpClient) { }
  save(model:any){
    return this.http.post(this.apiUrl+'/addProduct',model);
  }

  getProducts(){
    return this.http.get(this.apiUrl+"/getProducts");
  }
}
