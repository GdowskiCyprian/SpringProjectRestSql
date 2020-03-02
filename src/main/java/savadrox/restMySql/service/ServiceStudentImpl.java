package savadrox.restMySql.service;

import org.springframework.stereotype.Service;
import savadrox.restMySql.model.Student;
import savadrox.restMySql.repository.RepositoryStudent;

import java.util.List;

@Service("ServiceStudent")
public class ServiceStudentImpl implements ServiceStudent {
    public RepositoryStudent repositoryStudent;

    public ServiceStudentImpl(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    @Override
    public void postStudent(Student student) {
        repositoryStudent.save(student);
    }

    @Override
    public List<Student> getStudentAll() {
        return repositoryStudent.findAll();
    }

    @Override
    public Student getStudentById(Long id) { return repositoryStudent.findById(id).get();}

    @Override
    public void deleteStudent(Long id) { repositoryStudent.deleteById(id);    }
}
