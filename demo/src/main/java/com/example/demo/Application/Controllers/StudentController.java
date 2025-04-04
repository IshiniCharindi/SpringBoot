package com.example.demo.Application.Controllers;

import com.example.demo.External.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //req res handle krna hdpu controller ekk kyla spring boot wlt kynw
                    //me annotation ek haraha
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
}

