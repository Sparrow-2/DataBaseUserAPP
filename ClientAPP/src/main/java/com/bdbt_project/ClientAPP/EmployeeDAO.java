package com.bdbt_project.ClientAPP;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class WorkersDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List <Employee> list(){
      String sql = "SELECT * FROM PRACOWNICY";
        List<Employee> listWorkers = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));

    return listWorkers;
    }
    public void save(Employee workers){

    }
    public Employee get(int id){
        return null;
    }

    public WorkersDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(Employee workers){

    }
    public void delete(int id){

    }



}
*/