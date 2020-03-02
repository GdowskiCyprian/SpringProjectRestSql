package savadrox.restMySql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import savadrox.restMySql.model.Student;

@Repository
public interface RepositoryStudent extends JpaRepository<Student, Long> {
}
