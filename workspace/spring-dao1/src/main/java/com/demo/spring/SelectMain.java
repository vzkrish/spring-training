package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class SelectMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		List<Emp> empList = jt.query("select * from EMP", new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));
			}

		});

		for (Emp e : empList) {
			System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary());
		}

		// =======//=======
		jt.query("select * from EMP", new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println(rs.getInt("EMPNO") + " " + rs.getString("NAME") + " " + rs.getString("ADDRESS") + " "
						+ rs.getDouble("SALARY"));

			}
		});

		Emp e = jt.queryForObject("select * from EMP where EMPNO=200", new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));
			}

		});
		
		System.out.println(e.getName() + " " + e.getSalary());
		
		

		Emp e1 = jt.queryForObject("select * from EMP where EMPNO=200", Emp.class);
		System.out.println(e1.getName() + " " + e1.getSalary());
	}

}
