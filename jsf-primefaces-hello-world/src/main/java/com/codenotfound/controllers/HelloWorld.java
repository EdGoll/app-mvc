package com.codenotfound.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.xml.ws.Response;

import com.codenotfound.model.Student;
import com.codenotfound.services.StudentService;

import org.springframework.web.client.RestTemplate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

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
    s.setNombre(firstName + " " + lastName);
    this.listaStudent.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Student> return the listaStudent
     */
    public List<Student> getListaStudent() {
        return listaStudent;
    }

  

}
