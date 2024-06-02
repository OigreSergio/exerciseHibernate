package com.example.ExerciseHibernate.repository;

import com.example.ExerciseHibernate.entitys.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Long> {
}
