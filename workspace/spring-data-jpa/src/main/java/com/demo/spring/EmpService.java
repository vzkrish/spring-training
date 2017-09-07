package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	MyRepo dao;

	/*
	 * public void setEmpDao(EmpDao dao) { this.dao = dao; }
	 */

	public String registerEmp(int id, String name, String city, double salary) {

		Emp e = dao.save(new Emp(id, name, city, salary));
		if (e != null)
			return "Data Saved";
		else
			return "data Not saved";
	}

	public Emp serachEmp(int id) {
		return dao.findOne(id);
	}
}
