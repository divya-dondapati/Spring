package info.google.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	private Integer id;
	@Column(name = "name")
	private String ename;
	@Column(name = "salary")
	private Double sal;

	public Employee() {

	}

	public Employee(Integer id, String ename, Double sal) {

		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}

	public Integer getEid() {
		return id;
	}

	public void setEid(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}

}
