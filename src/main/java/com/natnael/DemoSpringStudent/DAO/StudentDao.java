package com.natnael.DemoSpringStudent.DAO;

import com.natnael.DemoSpringStudent.Entity.Student;
import com.natnael.DemoSpringStudent.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by natna on 12/19/2016.
 */
@Repository
public class StudentDao {

    private static Map<Integer,Student> students;

    static {

        students=new HashMap<Integer, Student>(){

            {
                put(1, new Student(1,"Said","Computer Science"));
                put(2, new Student(2,"Nati","programming "));
                put(3, new Student(3,"Loto","Compiler"));
                put(4, new Student(4,"Dim","Method"));
                put(5, new Student(5,"Yoz","Automation"));
            }
        };
    }

    public Collection<Student> getAllStudents(){


        return this.students.values();
    }
    public Student getStudentById(int id){

        return this.students.get(id);
    }
}
