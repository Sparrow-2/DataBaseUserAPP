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
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("TRASY").usingColumns("NR_TRASY", "DLUGOSC","PRZYSTANEK_POCZATKOWY","PRZYSTANEK_KONCOWY","NR_ZARZADU");


        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(trasy);
        insertActor.execute(param);
    }

    public Trasy get(int Nr_trasy) {
        Object[] args = {Nr_trasy};
        String sql = "SELECT * FROM TRASY WHERE NR_TRASY  = " + "'"+args[0].toString()+"'";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Trasy.class));
    }

    public void update(Trasy trasy) {
        String sql = "UPDATE TRASY SET DLUGOSC=:Dlugosc, PRZYSTANEK_POCZATKOWY=:Przystanek_poczatkowy, PRZYSTANEK_KONCOWY=:Przystanek_koncowy WHERE NR_TRASY=:Nr_trasy";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(trasy);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }

    public void delete(int Nr_trasy) {
        String sql = "DELETE FROM TRASY WHERE NR_TRASY = ?";
        jdbcTemplate.update(sql,Nr_trasy);

    }
}
