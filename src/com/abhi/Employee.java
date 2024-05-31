package com.abhi;

public class Employee {

	private Integer eid;
	private String name;
	private String Gender;
	private String dtOfJoin;
	private Double salary;

	public Employee(Integer eid, String name, String gender, String dtOfJoin, Double salary) {
		super();
		this.eid = eid;
		this.name = name;
		Gender = gender;
		this.dtOfJoin = dtOfJoin;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDtOfJoin() {
		return dtOfJoin;
	}

	public void setDtOfJoin(String dtOfJoin) {
		this.dtOfJoin = dtOfJoin;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
