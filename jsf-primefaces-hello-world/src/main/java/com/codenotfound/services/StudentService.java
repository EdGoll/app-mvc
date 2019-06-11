package com.codenotfound.services;

import java.util.List;

import com.codenotfound.model.Student;
import com.codenotfound.model.dao.StudentDao;
import com.codenotfound.model.dao.StudentDaoImpl;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

  
    private StudentDao dao = new StudentDaoImpl();

    public List<Student> getStudentList() {
        return this.dao.findAll();
    }

}