package com.example.ExerciseHibernate.entitys;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table
public class ClassesJava23 {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String title, description;

    public ClassesJava23() {
    }

    public ClassesJava23(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
