package com.natnael.DemoSpringStudent.Controller;

import com.natnael.DemoSpringStudent.Entity.Student;
import com.natnael.DemoSpringStudent.Service.StudentServie;
import com.natnael.DemoSpringStudent.Entity.Student;
import com.natnael.DemoSpringStudent.Service.StudentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by natna on 12/19/2016.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServie studentServie;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {

        return studentServie.getAllStudents();
    }


    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {

        return studentServie.getStudentById(id);
    }
}
