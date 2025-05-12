package app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Dept {
	@Id
	@Column(name = "deptno")
	private Integer deptno;
	
	@Column(name="dname")
	private String dname;
	
	@Column(name = "loc")
	private String loc;

	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private List<Emp> emps = new ArrayList<>();

	
}
