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

public class BiletyDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public BiletyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Bilety> list() {
        String sql = "SELECT * FROM BILETY";
        List<Bilety> listBilety = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Bilety.class));

        return listBilety;
    }
    public List<Bilety> getUserTickets()  {

        String sql = "SELECT * FROM BILETY WHERE NR_KLIENTA  = 3";

        List<Bilety> listUserTickets = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Bilety.class));
        return listUserTickets;

    }

    public void save(Bilety bilety) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("BILETY").usingColumns("NR_BILETU", "RODZAJ_BILETU",
                "CZY_ULGOWY", "CENA","NR_ZARZADU","NR_KLIENTA");


        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(bilety);
        insertActor.execute(param);

    }

    public Bilety get(int Nr_biletu) {
        Object[] args = {Nr_biletu};
        String sql = "SELECT * FROM BILETY WHERE NR_BILETU  = " + "'"+args[0].toString()+"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Bilety.class));

    }

    public void update(Bilety bilety) {
        String sql = "UPDATE BILETY SET MIASTO=:Miasto, ULICA=:Ulica,NR_DOMU=:Nr_domu, NR_LOKALU=:Nr_lokalu, NR_POCZTY =:Nr_poczty WHERE NR_ADRESU=:Nr_adresu";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(bilety);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int Nr_biletu) {
        String sql = "DELETE FROM BILETY WHERE NR_BILETU = ?";
        jdbcTemplate.update(sql,Nr_biletu);
    }

}
