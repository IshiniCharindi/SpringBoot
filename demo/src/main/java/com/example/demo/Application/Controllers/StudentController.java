package com.example.demo.Application.Controllers;

import com.example.demo.Application.DTO.Response.StudentGeneralDTO;
import com.example.demo.Domain.Entity.Student;
import com.example.demo.Domain.Service.StudentService;
import com.example.demo.External.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController     //req res handle krna hdpu controller ekk kyla spring boot wlt kynw
                    //me annotation ek haraha
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getStudent")
    public ResponseEntity<StudentGeneralDTO> getStudent(@RequestParam Integer id){
        return studentService.getStudent(id);
    }
}

