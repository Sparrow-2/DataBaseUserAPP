package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class BiletyDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public BiletyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Bilety> list() {
        String sql = "SELECT * FROM BILETY";
        List<Bilety> listBilety = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Bilety.class));

        return listBilety;
    }

    public void save(Bilety bilety) {

    }

    public Bilety get(int Nr_biletu) {
        return null;
    }

    public void update(Bilety bilety) {

    }

    public void delete(int Nr_biletu) {

    }

}
