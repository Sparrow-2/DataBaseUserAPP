package com.bdbt_project.ClientAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class StopDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public StopDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Stop> list(){
        String sql = "SELECT * FROM PRZYSTANKI";

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Stop.class));
    }
    public void save(Stop stop) { // jak to nie dziala to moze dumb version typu insert jako string za działa ale nie mam siły dzisiaj na to...

        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("PRZYSTANKI").usingColumns("NR_PRZYSTANKU", "NAZWA_PRZYSTANKU","RODZAJ_PRZYSTANKU","CZY_BILETOMAT",
                "CZY_EKRAN", "CZY_WIATA","NR_ZARZADU");


        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(stop);
        insertActor.execute(param);
    }
    public Stop get(int nr_przystanku) {
        Object[] args = {nr_przystanku};
        String sql = "SELECT * FROM PRZYSTANKI WHERE NR_PRZYSTANKU  = " + "'"+args[0].toString()+"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Stop.class));


    }
    public Stop get_atr(String nazwa_przystanku) {
        Object[] args = {nazwa_przystanku};
        String sql = "SELECT * FROM PRZYSTANKI WHERE NAZWA_PRZYSTANKU  = " +"'" +args[0].toString() +"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Stop.class));


    }




}