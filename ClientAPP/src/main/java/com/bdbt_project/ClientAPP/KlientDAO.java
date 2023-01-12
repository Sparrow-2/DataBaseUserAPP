package com.bdbt_project.ClientAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KlientDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public KlientDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Klient> list() {
        String sql = "SELECT * FROM KLIENCI";
        List<Klient> listKlient = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Klient.class));

        return listKlient;
    }

    public void save(Klient klient) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("KLIENCI").usingColumns("NR_KLIENTA","IMIE_KLIENTA","NAZWISKO_KLIENTA","PLEC_KLIENTA","DATA_URODZENIA_KLIENTA","PESEL_KLIENTA","EMAIL_KLIENTA","NR_TELEFONU_KLIENTA","NR_ZARZADU","NR_ADRESU","NR_POCZTY");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(klient);
        insertActor.execute(param);
    }

    }

    public Klient get(int Nr_klienta) {
        return null;
    }

    public void update(Klient klient) {

    }

    public void delete(int Nr_klienta) {

    }

}
