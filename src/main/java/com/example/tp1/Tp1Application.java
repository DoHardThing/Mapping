package com.example.tp1;

import com.example.tp1.dao.entities.Student;
import com.example.tp1.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepo;

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student(1L, "Doha", new Date(2002,07,01), "M1");
        studentRepo.save(student);
    }

}
