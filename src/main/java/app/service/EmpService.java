package app.service;

import app.api.dto.UpdateEmpResponse;
import app.api.dto.UpdateEmpRequest;
import app.entity.Dept;
import app.entity.Emp;
import app.repository.DeptRepository;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmpService {

    private final EmpRepository empRepository;
    private final DeptRepository deptRepository;

    public EmpService(EmpRepository empRepository, DeptRepository deptRepository) {
        this.empRepository = empRepository;
        this.deptRepository = deptRepository;
    }

    @Transactional
    public UpdateEmpResponse updateEmp(Integer empno, UpdateEmpRequest updateRequest) {

        Emp findEmp = empRepository.findById(empno)
                .orElseThrow(() -> new EntityNotFoundException("사원이 존재하지 않습니다."));

        Dept dept = deptRepository.findById(updateRequest.getDeptno())
                .orElseThrow(() -> new EntityNotFoundException("부서가 존재하지 않습니다."));

        findEmp.updateEmp(
                //updateReq.getEmpno(),
                updateRequest.getEname(),
                updateRequest.getJob(),
                updateRequest.getMgr(),
                updateRequest.getHiredate(),
                updateRequest.getSal(),
                updateRequest.getComm(),
                dept
        );

        return UpdateEmpResponse.from(findEmp, dept);
    }

}
