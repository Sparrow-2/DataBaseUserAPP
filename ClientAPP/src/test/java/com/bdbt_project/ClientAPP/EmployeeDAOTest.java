package com.bdbt_project.ClientAPP;

import com.bdbt_project.ClientAPP.WorkersDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeDAOTest {
    private EmployeesDAO dao;
    @BeforeEach
    void setUp() throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        dataSource.setUsername("BDBTGRC13");
        dataSource.setPassword("BDBTGRC13");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new EmployeesDAO(new JdbcTemplate(dataSource));
    }
    @Test
    void testList(){
        List<Employee> listWorkers = dao.list();
        assertTrue(listWorkers.isEmpty());
    }
}
