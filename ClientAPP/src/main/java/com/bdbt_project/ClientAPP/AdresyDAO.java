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
public class AdresyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public AdresyDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Adresy> list() {
        String sql = "SELECT * FROM ADRESY";
        List<Adresy> listAdresy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Adresy.class));

        return listAdresy;
    }

    public void save(Adresy adresy) {

            SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
            insertActor.withTableName("ADRESY").usingColumns("NR_ADRESU", "MIASTO","ULICA","NR_DOMU",
                    "NR_LOKALU", "NR_POCZTY");


            BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adresy);
            insertActor.execute(param);
        }



    public Adresy get(int nr_adresu) {
        Object[] args = {nr_adresu};
        String sql = "SELECT * FROM ADRESY WHERE NR_ADRESU  = " + "'" + args[0].toString() + "'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Adresy.class));


    }
        public void update(Adresy adresy) {
            String sql = "UPDATE ADRESY SET MIASTO=:Miasto, ULICA=:Ulica, NR_DOMU=:Nr_domu,NR_LOKALU=:Nr_lokalu, NR_POCZTY=:Nr_poczty WHERE NR_ADRESU=:Nr_adresu";
            BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adresy);

            NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

            template.update(sql, param);
    }

    public void delete(int Nr_adresu) {


            String sql = "DELETE FROM ADRESY WHERE NR_ADRESU = ?";
            jdbcTemplate.update(sql,Nr_adresu);

        }
    }

