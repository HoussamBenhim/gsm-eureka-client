package com.gestionstock.eurekaCLientservice;

import com.gestionstock.eurekaCLientservice.student.Student;
import com.gestionstock.eurekaCLientservice.student.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class InitCommandRunner implements CommandLineRunner {

    private final StudentRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("benhim", "houssam");
        repository.save(student1);
    }
}
