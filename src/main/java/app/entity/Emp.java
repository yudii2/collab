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
	
	@Column(name = "enmae")
	private String ename;
	
	@Column(name = "job")
	private String job;
	
	@Column(name = "mrg")
	private Integer mrg;
	
	@Column(name = "hireDate")
	private LocalDate hireDate;
	
	@Column(name = "sal")
	private double sal;
	
	@Column(name = "comm")
	private double comm;
	
	@Column(name = "deptno")
	private Integer deptno;
}
