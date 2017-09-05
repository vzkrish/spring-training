package com.demo.spring;

public class EmpService {

	EmpDao dao;

	public void setEmpDao(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		String resp = dao.save(new Emp(id, name, city, salary));
		return resp;
	}
}
