package com.natnael.DemoSpringStudent.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by natna on 12/19/2016.
 */
@EntityScan
public class Student {
    @Id
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
