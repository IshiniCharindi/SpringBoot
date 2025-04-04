package com.example.demo.External.Repository;

import com.example.demo.Domain.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {

    //Custom Queries
    //namen search krna query ek me wge lyna plwn
    //optional eken wenne value ekk nttn null ointer exception ekk denne ntw null Student knk return krnw
    Optional<Student> findByName(String name);
    List<Student> findByDobBetween(String dob1 , String dob2);  //date range ek athule ina students la return wnw
    List<Student> findByGradeIn(List<Integer> grade);//list eke tyn grades wlt adala student list ek return wnw
}
