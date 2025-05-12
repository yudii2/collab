package app.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/emp")
public class EmpAPIController {

    private final EmpRepository empRepository;

    // 사원 추가
    @PostMapping
    public ResponseEntity<Emp> createEmp(@RequestBody Emp emp) {
        Emp savedEmp = empRepository.save(emp);
        return ResponseEntity
                .created(URI.create("/api/emp/" + savedEmp.getEmpno()))
                .body(savedEmp);
    }
}
