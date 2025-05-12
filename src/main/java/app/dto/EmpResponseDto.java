package app.dto;

import app.entity.Dept;
import app.entity.Emp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpResponseDto {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDate hireDate;
    private Integer salary;
    private Integer comm;
    private Integer deptno;

    public static EmpResponseDto from(Emp emp) {
        Dept dept = emp.getDept();
        return new EmpResponseDto(
                emp.getEmpno(),
                emp.getEname(),
                emp.getJob(),
                emp.getMgr(),
                emp.getHireDate(),
                emp.getComm(),
                emp.getSalary(),
                dept.getDeptno()
        );
    }
}

