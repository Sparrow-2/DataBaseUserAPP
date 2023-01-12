package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TrasyDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public TrasyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Trasy> list() {
        String sql = "SELECT * FROM TRASY";
        List<Trasy> listTrasy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Trasy.class));

        return listTrasy;
    }

    public void save(Trasy trasy) {

    }

    public Trasy get(int Nr_trasy) {
        return null;
    }

    public void update(Trasy trasy) {

    }

    public void delete(int Nr_trasy) {

    }
}
