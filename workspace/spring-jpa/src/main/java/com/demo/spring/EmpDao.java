package com.demo.spring;

import java.util.List;

public interface EmpDao {

	public String save(Emp e);

	public Emp find(int id);

	public List<Emp> getEmpList();

	public String delete(int id);

	public String update(Emp e);
}
