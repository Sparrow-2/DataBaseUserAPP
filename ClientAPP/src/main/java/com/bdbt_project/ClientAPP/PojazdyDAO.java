package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PojazdyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public PojazdyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Pojazdy> list() {
        String sql = "SELECT * FROM POJAZDY";
        List<Pojazdy> listPojazdy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pojazdy.class));

        return listPojazdy;
    }

    public void save(Pojazdy pojazdy) {

    }

    public Pojazdy get(int Nr_pojazdu) {
        return null;
    }

    public void update(Pojazdy pojazdy) {

    }

    public void delete(int Nr_pojazdu) {

    }
}
