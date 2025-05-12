package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Emp;
import app.repository.EmpRepository;
import app.util.ApiException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpService {
	
	private final EmpRepository empRepository;

	@Transactional
	public List<Emp> getEmps() {
		final List<Emp> emps = empRepository.findAll();		
		
		if (emps.isEmpty()) {
			throw new ApiException("사원정보가 존재하지 않습니다");
			
		}
		return emps;
	}
}
