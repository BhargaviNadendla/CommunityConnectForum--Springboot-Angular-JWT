import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private http: HttpClient) { }

  get() {
    return this.http.get('http://localhost:8080/api/list/questions');
  }

  getByTag(id) {
    return this.http.get('http://localhost:8080/api/list/questions/tag/'+id);
  }
}
