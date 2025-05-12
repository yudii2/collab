package app.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateEmpRequest {

    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDate hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

}
