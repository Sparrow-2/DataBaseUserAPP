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


            SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
            insertActor.withTableName("POJAZDY").usingColumns("NR_POJAZDU", "ROK_PRODUKCJI","LICZBA_MIEJSC","CZY_BILETOMAT",
                    "CZY_KLIMATYZACJA", "CZY_MONITORING","CZY_NISKOPODLOGOWY","NR_MODELU","NR_MARKI");


            BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pojazdy);
            insertActor.execute(param);
        }



    public Pojazdy get(int Nr_pojazdu) {
        Object[] args = {Nr_pojazdu};
        String sql = "SELECT * FROM POJAZDY WHERE NR_POJAZDU  = " + "'"+args[0].toString()+"'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Pojazdy.class));


    }

    public void update(Pojazdy pojazdy) {
        String sql = "UPDATE POJAZDY SET ROK_PRODUKCJI=:Rok_produkcji, LICZBA_MIEJSC=:Liczba_miejsc, CZY_BILETOMAT=:Czy_biletomat,CZY_KLIMATYZACJA=:Czy_klimatyzacja, CZY_MONITORING=:Czy_monitoring, CZY_NISKOPODLOGOWY =:Czy_niskopodlogowy,NR_MODELU=:Nr_modelu, NR_MARKI=:Nr_marki WHERE NR_POJAZDU=:Nr_pojazdu";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pojazdy);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }

    public void delete(int Nr_pojazdu) {
        String sql = "DELETE FROM POJAZDY WHERE NR_POJAZDU = ?";
        jdbcTemplate.update(sql,Nr_pojazdu);
    }
}
