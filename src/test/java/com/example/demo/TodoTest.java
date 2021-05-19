package com.example.demo;

import com.example.demo.controllers.TodoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class TodoTest {

    @Autowired
    TodoController todoController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenPostRequestValidThenOkResponse() throws Exception {
        String todo = "{\"id\": 0, \"name\": \"Test ToDo\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/todo")
                .content(todo)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void whenPostRequestInValidThenErrorResponse() throws Exception {
        String todo = "{\"id\": 0, \"name\": \"\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/todo")
                .content(todo)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

}