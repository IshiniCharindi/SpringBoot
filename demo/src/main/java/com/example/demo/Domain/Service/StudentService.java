package com.example.demo.Domain.Service;

import com.example.demo.Application.DTO.Response.StudentGeneralDTO;
import com.example.demo.External.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    private ModelMapper modelMapper;
    public ResponseEntity<StudentGeneralDTO> getStudent(Integer id) {

    }
}
