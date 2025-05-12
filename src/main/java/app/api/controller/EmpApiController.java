package app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.EmpResponseDto;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmpApiController {

	private final EmpService empService;
	
	@GetMapping("/emps")
	public List<EmpResponseDto> getEmps() {
		return empService.getEmps().stream()
				.map(emp -> EmpResponseDto.from(emp))
				.toList();
	}
}
