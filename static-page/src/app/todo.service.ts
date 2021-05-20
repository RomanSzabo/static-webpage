import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TodoModel } from './models/todo.model';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getTodo(id: number): Observable<TodoModel> {
    return this.http.get<TodoModel>('api/todo?id=' + id);
  }

}
