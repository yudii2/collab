package app.api.controller;

import app.dto.EmpResponseDto;
import app.entity.Emp;
import app.service.EmpService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/emp")
@AllArgsConstructor
public class EmpApiController {

	private final EmpService empService;

	@GetMapping("/test")
	public String empApi() {
		return "emp api controller";
	}

	@GetMapping("/{empno}")
	public ResponseEntity<?> getEmpByEmpno(@PathVariable int empno){
		Optional<Emp> emp = empService.findByEmpno(empno);
		if (emp.isPresent()) {
			return ResponseEntity.ok(EmpResponseDto.from(emp.get()));
		} else {
			Map<String, String> errorMsg = new HashMap<>();
			errorMsg.put("msg", "사원정보가 존재하지 않습니다");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMsg);
		}
	}
}
