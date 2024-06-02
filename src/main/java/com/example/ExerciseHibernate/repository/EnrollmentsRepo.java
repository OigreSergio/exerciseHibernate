package com.example.ExerciseHibernate.repository;

import com.example.ExerciseHibernate.entitys.Enrollments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentsRepo extends JpaRepository<Enrollments , Long> {
}
