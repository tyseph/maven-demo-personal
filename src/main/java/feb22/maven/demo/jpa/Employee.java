package feb22.maven.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "employee_id")
	private int eid;
	@Column(name = "first_name ")
	private String fName;
	@Column(name = "salary") // SQL Naming convention
	private double salary; // Java
	
//	@OneToOne
//	@OneToMany
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.fName = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return fName;
	}

	public void setName(String name) {
		this.fName = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + fName + ", salary=" + salary;
	}

}
