package com.bdbt_project.ClientAPP;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PocztyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public PocztyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Poczty> list() {
        String sql = "SELECT * FROM POCZTY";
        List<Poczty> listPoczty = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Poczty.class));

        return listPoczty;
    }

    public void save(Poczty poczty) {

    }

    public Poczty get(int Nr_poczty) {
        return null;
    }

    public void update(Poczty poczty) {

    }

    public void delete(int Nr_poczty) {

    }
}
