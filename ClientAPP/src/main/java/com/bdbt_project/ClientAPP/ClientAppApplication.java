package com.bdbt_project.ClientAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class ClientAppApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ClientAppApplication.class, args);


	}
	@Override
	public void run(String ... args) throws Exception
		{
			String sql = "SELECT * FROM PRACOWNICY";
			List<Employee> listWorkers = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
			listWorkers.forEach(System.out :: println);
		}


}
