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
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("SPRZEDAZE").usingColumns("NR_BILETU", "DATA_SPRZEDAZY");


        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sprzedaze);
        insertActor.execute(param);

    }

    public Sprzedaze get(int Nr_biletu) {
        Object[] args = {Nr_biletu};
        String sql = "SELECT * FROM SPRZEDAZE WHERE NR_BILETU  = " + "'"+args[0].toString()+"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Sprzedaze.class));
    }

    public void update(Sprzedaze sprzedaze) {
        String sql = "UPDATE SPRZEDAZE SET DATA_SPRZEDAZY=:Data_sprzedazy WHERE NR_BILETU=:Nr_biletu";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sprzedaze);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }

    public void delete(int Nr_biletu) {
        String sql = "DELETE FROM SPRZEDAZE WHERE NR_BILETU = ?";
        jdbcTemplate.update(sql,Nr_biletu);

    }
}
