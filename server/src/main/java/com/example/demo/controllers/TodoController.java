package com.example.demo.controllers;

import com.example.demo.models.ToDo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TodoController {

    @GetMapping(value = "todo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ToDo> getTodo(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ToDo.builder().id(id).name("Test ToDo Item").build());
    }

    @PostMapping(value = "todo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ToDo> addToDo(@Valid @RequestBody ToDo todo) {
        return ResponseEntity.ok(todo);
    }

}
