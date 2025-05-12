package app.api.dto;

import app.entity.Dept;
import app.entity.Emp;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateEmpReponse {

    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDate hiredate;

    private Double sal;

    private Double comm;

    private Integer deptno;

    public UpdateEmpReponse(Emp findEmp) {
        this.empno = findEmp.getEmpno();
        this.ename = findEmp.getEname();
        this.job = findEmp.getJob();
        this.mgr = findEmp.getMgr();
        this.hiredate = findEmp.getHiredate();
        this.sal = findEmp.getSal();
        this.comm = findEmp.getComm();
        this.deptno = findEmp.getDept().getDeptno();
    }


    public class UpdateEmpResponse {
        private Integer empno;
        private String ename;
        private String job;
        private Integer mgr;
        private LocalDate hiredate;
        private Double sal;
        private Double comm;
        private Integer deptno;

        public UpdateEmpResponse(Emp emp) {
            this.empno = emp.getEmpno();
            this.ename = emp.getEname();
            this.job = emp.getJob();
            this.mgr = emp.getMgr();
            this.hiredate = emp.getHiredate();
            this.sal = emp.getSal();
            this.comm = emp.getComm();
            this.deptno = emp.getDept().getDeptno();
        }
    }
}
