import { Component, OnInit } from '@angular/core';
import { TodoModel } from '../models/todo.model';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  todoId: number;
  isLoading = false;
  todo: TodoModel;

  constructor(private todoService: TodoService) { }

  ngOnInit(): void {
  }

  search(): void {
    this.isLoading = true;
    this.todoService.getTodo(this.todoId).subscribe(data => this.todo = data, error => console.log(error), () => this.isLoading = false);
  }

}
