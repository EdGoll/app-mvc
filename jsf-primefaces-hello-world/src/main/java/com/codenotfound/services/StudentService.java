package com.codenotfound.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Student;

import org.apache.commons.io.IOUtils;

public class StudentService {

    public List<Student> getStudentList() {
        String data = this.readFile();
        List<Student> listaEStudents = this.buildStudentList(data);
        return listaEStudents;
    }

    public List<Student> buildStudentList(String data) {
        List<Student> list = new ArrayList<Student>();
        Student student = null;
        for (String nombreStudiante : data.split(";")) {
            student = new Student();
            student.setNombre(nombreStudiante.trim());
            list.add(student);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/datos.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}