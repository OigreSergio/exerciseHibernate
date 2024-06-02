package com.example.ExerciseHibernate.repository;

import com.example.ExerciseHibernate.entitys.ClassesJava23;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassJava23Repo extends JpaRepository<ClassesJava23 , Long> {
}
