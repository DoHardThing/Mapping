package com.example.tp1.dao.repositories;
import com.example.tp1.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long>{
}
