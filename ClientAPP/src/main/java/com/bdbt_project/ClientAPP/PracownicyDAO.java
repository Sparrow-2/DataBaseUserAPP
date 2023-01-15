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

public class PracownicyDAO {
    private JdbcTemplate jdbcTemplate;




    public List<Pracownicy> list() {
        String sql = "SELECT * FROM PRACOWNICY";
        List<Pracownicy> listPracownicy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));

        return listPracownicy;
    }

    public void save(Pracownicy pracownicy) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("PRACOWNICY").usingColumns("NR_PRACOWNIKA","IMIE_PRACOWNIKA","NAZWISKO_PRACOWNIKA","PESEL_PRACOWNIKA", "PLEC_PRACOWNIKA","NR_KONTA", "NR_TELEFONU_PRACOWNIKA","EMAIL_PRACOWNIKA", "DATA_URODZENIA_PRACOWNIKA", "DATA_ZATRUDNIENIA", "DATA_BADANIA", "DATA_WAZNOSCI_BADAN","NR_ZARZADU","NR_ADRESU","NR_POCZTY", "NR_STANOWISKA");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
        insertActor.execute(param);
    }


    public Pracownicy get(int nr_pracownika) {
        Object[] args = {nr_pracownika};
        String sql = "SELECT * FROM PRACOWNICY WHERE NR_PRACOWNIKA  = " + "'" + args[0].toString() + "'";

        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));

    }

    public void update(Pracownicy pracownicy) {
        String sql = "UPDATE PRACOWNICY SET IMIE_PRACOWNIKA=:Imie_pracownika, NAZWISKO_PRACOWNIKA=:Nazwisko_pracownika, PESEL_PRACOWNIKA=:PESEL_pracownika, PLEC_PRACOWNIKA=:Plec_pracownika, NR_KONTA=:Nr_konta, NR_TELEFONU_PRACOWNIKA=:Nr_telefonu_pracownika, EMAIL_PRACOWNIKA=:Email_pracownika, DATA_URODZENIA_PRACOWNIKA=:Data_urodzenia_pracownika, DATA_ZATRUDNIENIA=:Data_zatrudnienia, DATA_BADANIA=:Data_badania, DATA_WAZNOSCI_BADAN=: Data_waznosci_badan, NR_ZARZADU=:Nr_zarzadu, NR_ADRESU=:Nr_adresu, NR_POCZTY=:Nr_poczty, NR_STANOWISKA=:Nr_stanowiska WHERE NR_PRACOWNIKA=:Nr_pracownika";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);

        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);

    }

    public void delete(int Nr_pracownika) {
        // trzeba pomyslec jak to zrobić
        String sql = "DELETE FROM PRACOWNICY WHERE NR_PRACOWNIKA = ?";
        jdbcTemplate.update(sql,Nr_pracownika);

    }
    public PracownicyDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
}
