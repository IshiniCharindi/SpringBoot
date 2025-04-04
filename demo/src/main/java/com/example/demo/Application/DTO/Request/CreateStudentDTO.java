package com.example.demo.Application.DTO.Request;

import lombok.Data;

@Data
public class CreateStudentDTO {
    private String name;
    private String address;
    private String email;
    private Integer grade;

}
