package com.example.ExerciseHibernate.entitys;

import jakarta.persistence.*;

@Entity
@Table
public class Enrollments {
    @Id
    @GeneratedValue
    private long id;
    @JoinColumn(nullable = false)
    @ManyToOne
    private ClassesJava23 classes;
    @JoinColumn
    @ManyToOne
    private Student student;

    public Enrollments() {
    }
}
