package com.demo.spring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmpDaoJPAImpl implements EmpDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public String save(Emp e) {
		em.persist(e);
		return "Data Saved";
	}

	@Override
	public Emp find(int id) {
		Emp e = em.find(Emp.class, id);
		return e;
	}

	@Override
	public List<Emp> getEmpList() {
		Query query = em.createQuery("select e from Emp e");
		return query.getResultList();
	}

	@Override
	public String delete(int id) {
		Emp e = find(id);
		em.remove(e);
		return "Deleted";
	}

	@Override
	public String update(Emp e) {
		Emp e1 = em.merge(e);
		return "Updated";
	}

}
