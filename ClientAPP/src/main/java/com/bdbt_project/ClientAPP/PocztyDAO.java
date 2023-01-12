package com.bdbt_project.ClientAPP;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("POCZTY").usingColumns("NR_POCZTY", "KOD_POCZTOWY","POCZTA");



        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(poczty);
        insertActor.execute(param);

    }

    public Poczty get(int Nr_poczty) {
        Object[] args = {Nr_poczty};
        String sql = "SELECT * FROM POCZTY WHERE NR_POCZTY  = " + "'" + args[0].toString() + "'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Poczty.class));


    }

    public void update(Poczty poczty) {

        String sql = "UPDATE POCZTY SET KOD_POCZTOWY=:Kod_pocztowy, POCZTA=:Poczta WHERE NR_POCZTY=:Nr_poczty";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(poczty);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int Nr_poczty) {
        String sql = "DELETE FROM POCZTY WHERE NR_PRZYSTANKU = ?";
        jdbcTemplate.update(sql,Nr_poczty);
    }
}
