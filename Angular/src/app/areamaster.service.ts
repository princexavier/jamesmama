import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AreamasterService {

  apiUrl:string ="http://localhost:8080/addArea";
  constructor(private http: HttpClient) { }

  save(data) {
    return this.http.post(this.apiUrl, data);
  }
}
