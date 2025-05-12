package app.service;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmpService {
    private final EmpRepository empRepository;

    public Optional<Emp> findByEmpno(int empno) {
        return empRepository.findByEmpno(empno);
    }

}
