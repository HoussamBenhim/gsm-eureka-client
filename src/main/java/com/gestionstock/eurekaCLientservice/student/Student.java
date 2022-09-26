package com.gestionstock.eurekaCLientservice.student;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lastname;
    private String firstname;

    public Student(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
