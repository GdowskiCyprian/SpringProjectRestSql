package savadrox.restMySql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import savadrox.restMySql.model.Student;
import savadrox.restMySql.service.ServiceStudent;

import java.util.List;


@RestController
public class ControllerStudent {
    @Autowired
    @Qualifier("ServiceStudent")
    ServiceStudent serviceStudent;

    @RequestMapping("/studentAll")
    public List<Student> getStudents(){
        return serviceStudent.getStudentAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/poststudent")
    public void postStudent(@RequestBody Student student){
        serviceStudent.postStudent(student);
    }

    @RequestMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return serviceStudent.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delStudent/{id}")
    public void deleteStudent(@PathVariable Long id){
        serviceStudent.deleteStudent(id);
    }



}
