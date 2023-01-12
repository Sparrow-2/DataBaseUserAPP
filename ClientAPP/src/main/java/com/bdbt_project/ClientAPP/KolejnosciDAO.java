package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KolejnosciDAO {

    private JdbcTemplate jdbcTemplate;


    public KolejnosciDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Kolejnosci> list() {
        String sql = "SELECT * FROM KOLEJNOSCI";
        List<Kolejnosci> listKolejnosci = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kolejnosci.class));

        return listKolejnosci;
    }

    public void save(Kolejnosci kolejnosci) {

    }

    public Kolejnosci get(int Nr_kolejnosci) {
        return null;
    }

    public void update(Kolejnosci kolejnosci) {

    }

    public void delete(int Nr_kolejnosci) {

    }
}
