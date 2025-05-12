package app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Emp {
    @Id
    @Column(name = "empno")
    private Integer empno;

    @Column(name="ename")
    private String ename;

    @Column(name = "job")
    private String job;

    private Integer mgr;

    private LocalDate hireDate;

    private Integer comm;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "deptno")
    private Dept dept;

}
