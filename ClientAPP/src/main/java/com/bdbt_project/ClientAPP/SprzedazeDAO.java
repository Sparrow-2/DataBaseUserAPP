package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SprzedazeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public SprzedazeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Sprzedaze> list() {
        String sql = "SELECT * FROM SPRZEDAZE";
        List<Sprzedaze> listSprzedaze = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sprzedaze.class));

        return listSprzedaze;
    }

    public void save(Sprzedaze sprzedaze) {

    }

    public Sprzedaze get(int Nr_biletu) {
        return null;
    }

    public void update(Sprzedaze sprzedaze) {

    }

    public void delete(int Nr_biletu) {

    }
}
