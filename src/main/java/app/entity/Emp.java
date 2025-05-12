package app.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "job")
	private String job;
	
	@Column(name = "mgr")
	private Integer mgr;
	
	@Column(name = "hiredate")
	private LocalDate hiredate;
	
	@Column(name = "sal")
	private Double sal;
	
	@Column(name = "comm")
	private Double comm;
	
	@Column(name = "deptno")
	private Integer deptno;
}
