package com.example.demo.models;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
public class ToDo {

    @NotNull(message = "Id is missing")
    private Long id;
    @NotBlank(message = "Name is missing")
    @Size(max = 50)
    private String name;

}
