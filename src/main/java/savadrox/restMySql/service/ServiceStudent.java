package savadrox.restMySql.service;

import savadrox.restMySql.model.Student;

import java.util.List;

public interface ServiceStudent {
    public void postStudent(Student student) ;
    public List<Student> getStudentAll();
    public Student getStudentById(Long id);
    public void deleteStudent(Long id);
}
