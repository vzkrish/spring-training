package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	EmpDao dao;

	/*public void setEmpDao(EmpDao dao) {
		this.dao = dao;
	}*/

	public String registerEmp(int id, String name, String city, double salary) {
		String resp = dao.save(new Emp(id, name, city, salary));
		return resp;
	}
	
	public Emp serachEmp(int id){
		return dao.find(id);
	}
}
