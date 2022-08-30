package com.training.springboot.h2.repository;

import com.training.springboot.h2.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}