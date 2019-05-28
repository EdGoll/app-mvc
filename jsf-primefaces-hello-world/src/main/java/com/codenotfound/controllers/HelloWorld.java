package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import com.codenotfound.model.Student;
import com.codenotfound.services.StudentService;

@Named
public class HelloWorld {

  private String firstName = "John";
  private String lastName = "Doe";
  private StudentService studentService = new  StudentService();
  private List<Student> listaStudent = new ArrayList<Student>();

  @PostConstruct
  public void init(){
    this.listaStudent = studentService.getStudentList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Student s = new Student();
    s.setNombre(firstName.toUpperCase() + " " + lastName.toUpperCase());
    this.listaStudent.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    



    /**
     * @return StudentService return the studentService
     */
    public StudentService getStudentService() {
        return studentService;
    }

    /**
     * @param studentService the studentService to set
     */
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * @return List<Student> return the listaStudent
     */
    public List<Student> getListaStudent() {
        return listaStudent;
    }

    /**
     * @param listaStudent the listaStudent to set
     */
    public void setListaStudent(List<Student> listaStudent) {
        this.listaStudent = listaStudent;
    }

}
