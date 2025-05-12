package app.api.controller;

import app.api.dto.UpdateEmpResponse;
import app.api.dto.UpdateEmpRequest;
import app.service.EmpService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/emp")
public class EmpApiController {

	private final EmpService empService;

	public EmpApiController(EmpService empService) {
		this.empService = empService;
	}

	@PutMapping("/{empno}")
	public UpdateEmpResponse updateEmp(@PathVariable("empno") Integer empno, @RequestBody UpdateEmpRequest updateRequest) {
		return empService.updateEmp(empno, updateRequest);
	}

}