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
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("KOLEJNOSCI").usingColumns("NR_TRASY", "NR_PRZYSTANKU","NR_KOLEJNOSC");


        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(kolejnosci);
        insertActor.execute(param);

    }

    public Kolejnosci get(int Nr_kolejnosci) {

        Object[] args = {Nr_kolejnosci};
        String sql = "SELECT * FROM KOLEJNOSCI WHERE NR_KOLEJNOSCI  = " + "'"+args[0].toString()+"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Kolejnosci.class));

    }

    public void update(Kolejnosci kolejnosci) {

        String sql = "UPDATE KOLEJNOSCI SET NAZWA_NR_PRZYSTANKU=:Nr_przystanku, NR_KOLEJNOSC=:Nr_kolejnosc WHERE NR_TRASY=:Nr_trasy ";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(kolejnosci);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int Nr_kolejnosci) {
        String sql = "DELETE FROM KOLEJNOSCI WHERE NR_KOLEJNOSC = ?";
        jdbcTemplate.update(sql,Nr_kolejnosci);

    }
}
