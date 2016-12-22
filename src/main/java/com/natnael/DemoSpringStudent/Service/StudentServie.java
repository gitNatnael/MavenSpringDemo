package com.natnael.DemoSpringStudent.Service;

import com.natnael.DemoSpringStudent.DAO.StudentDao;
import com.natnael.DemoSpringStudent.DAO.StudentDao;
import com.natnael.DemoSpringStudent.Entity.Student;
import com.natnael.DemoSpringStudent.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by natna on 12/19/2016.
 */

@Service
public class StudentServie {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }


    public Student getStudentById(int id){

        return studentDao.getStudentById(id);
    }
}
