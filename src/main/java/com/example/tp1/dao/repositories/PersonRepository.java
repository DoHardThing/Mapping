package com.example.tp1.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp1.dao.entities.Person;
public interface PersonRepository extends JpaRepository<Person,Long>{
}
