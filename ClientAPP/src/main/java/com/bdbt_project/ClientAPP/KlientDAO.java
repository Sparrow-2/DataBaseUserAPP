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
public class KlientDAO {


    private JdbcTemplate jdbcTemplate;




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


    public Klient get(int nr_klienta) {
        Object[] args = {nr_klienta};
        String sql = "SELECT * FROM KLIENCI WHERE NR_KLIENTA  = " + "'" + args[0].toString() + "'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Klient.class));

    }

        public void update(Klient klient) {
        String sql = "UPDATE KLIENCI SET IMIE_KLIENTA=:Imie_klienta, NAZWISKO_KLIENTA=:Nazwisko_klienta, PLEC_KLIENTA=:Plec_klienta, DATA_URODZENIA_KLIENTA=:Data_urodzenia_klienta, PESEL_KLIENTA=:PESEL_klienta, EMAIL_KLIENTA=:Email_klienta, NR_TELEFONU_KLIENTA=:Nr_telefonu_klienta, NR_ZARZADU=:Nr_zarzadu, NR_ADRESU=:Nr_adresu, NR_POCZTY=:Nr_poczty WHERE NR_KLIENTA=:Nr_Klienta";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(klient);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int Nr_klienta) {
        // trzeba pomyslec jak to zrobić
        String sql = "DELETE FROM KLIENCI WHERE NR_KLIENTA = ?";
        jdbcTemplate.update(sql,Nr_klienta);

    }
    public KlientDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

}
