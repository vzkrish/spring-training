package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.transaction.annotation.Transactional;

public class DaoImpl implements Dao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	//@Transactional
	public String save(List<Emp> emps) {

		for (Emp e : emps) {
			jdbcTemplate.update(new PreparedStatementCreator() {

				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					PreparedStatement pst = conn
							.prepareStatement("insert into EMP(EMPNO,NAME,ADDRESS,SALARY) values(?,?,?,?)");
					pst.setInt(1, e.getEmpNo());
					pst.setString(2, e.getName());
					pst.setString(3, e.getAddress());
					pst.setDouble(4, e.getSalary());
					return pst;
				}
			});
		}
		return "Saved successfully..";
	}

}
