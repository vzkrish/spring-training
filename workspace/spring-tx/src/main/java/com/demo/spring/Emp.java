package com.demo.spring;

public class Emp {
	private int empNo;
	private String name;
	private String address;
	private double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empNo, String name, String address, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
