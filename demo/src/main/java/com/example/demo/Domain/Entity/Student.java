package com.example.demo.Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data     // getters setters wenuwata alternative ekk wdyt dna plwn
public class Student {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String email;
    private Integer grade;
}
