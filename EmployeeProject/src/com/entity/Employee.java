package com.entity;

public class Employee {
	private int empid;
	private  String  name;
	private  String  role;
	private int    salary;



	public Employee() {
		super();
	}



	public Employee(int empid, String name, String role, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}



	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}



	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}



	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}



	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}





}
