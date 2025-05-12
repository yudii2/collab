package app.dto;

import java.time.LocalDate;

import app.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmpResponseDto {

	private Integer empno;
	
	private String ename;
	
	private String job;
	
	private Integer mgr;
	
	private LocalDate hiredate;
	
	private Double sal;
	
	private Double comm;
	
	private Integer deptno;
	
    public static EmpResponseDto from(Emp emp) {
        
        return new EmpResponseDto(
                emp.getEmpno(),
                emp.getEname(),
                emp.getJob(),
                emp.getMgr(),
                emp.getHiredate(),
                emp.getComm(),
                emp.getSal(),
                emp.getDeptno()
        );
    }
}
