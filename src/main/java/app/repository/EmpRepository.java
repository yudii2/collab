package app.repository;

import app.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    Optional<Emp> findByEmpno(int empno);
}
