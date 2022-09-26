package com.gestionstock.eurekaCLientservice.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/student")
public class StudentController {

    private final StudentRepository repository;

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return repository.findById(Long.valueOf(studentId)).orElseThrow(()->new RuntimeException(String.format("No student find with ID of : %s", studentId)));
    }

}


