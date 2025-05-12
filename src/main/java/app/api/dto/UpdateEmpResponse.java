package app.api.dto;

import app.entity.Dept;
import app.entity.Emp;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateEmpResponse {

    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDate hiredate;

    private Double sal;

    private Double comm;

    private Integer deptno;

    private UpdateEmpResponse(Integer empno, String ename, String job, Integer mgr, LocalDate hiredate, Double sal, Double comm, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public static UpdateEmpResponse of(Integer empno, String ename, String job, Integer mgr,
                                       LocalDate hiredate, Double sal, Double comm, Integer deptno) {
        return new UpdateEmpResponse(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public static UpdateEmpResponse from(Emp emp, Dept dept) {
        return UpdateEmpResponse.of(emp.getEmpno(),
                emp.getEname(),
                emp.getJob(),
                emp.getMgr(),
                emp.getHiredate(),
                emp.getSal(),
                emp.getComm(),
                dept.getDeptno()
        );
    }
}
