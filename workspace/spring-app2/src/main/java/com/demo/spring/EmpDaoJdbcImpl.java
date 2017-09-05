package com.demo.spring;

import java.util.List;

public class EmpDaoJdbcImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		
		return "JDBC: Emp Registered with id "+e.getEmpId();
	}

	@Override
	public Emp find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

}
