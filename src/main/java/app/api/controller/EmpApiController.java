package app.api.controller;

import app.api.dto.UpdateEmpReponse;
import app.api.dto.UpdateEmpRequest;
import app.entity.Dept;
import app.entity.Emp;
import app.repository.DeptRepository;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/emp")
@Transactional
public class EmpApiController {

	private final EmpRepository empRepository;
	private final DeptRepository deptRepository;

	public EmpApiController(EmpRepository empRepository, DeptRepository deptRepository) {
		this.empRepository = empRepository;
		this.deptRepository = deptRepository;
	}

	@GetMapping("/test")
	public String empApi() {
		return "emp api controller";
	}

	@PutMapping("/{empno}")
	public UpdateEmpReponse updateEmp(@PathVariable("empno") Integer empno,
														@RequestBody UpdateEmpRequest updateReq) {

		Emp findEmp = empRepository.findById(empno)
				.orElseThrow(() -> new EntityNotFoundException("사원이 존재하지 않습니다."));

		Dept dept = deptRepository.findById(updateReq.getDeptno())
				.orElseThrow(() -> new EntityNotFoundException("부서가 존재하지 않습니다."));

		// 값 업데이트
		findEmp.updateEmp(
				//updateReq.getEmpno(),
				updateReq.getEname(),
				updateReq.getJob(),
				updateReq.getMgr(),
				updateReq.getHiredate(),
				updateReq.getSal(),
				updateReq.getComm(),
				dept
		);

		return new UpdateEmpReponse(findEmp);
	}
}