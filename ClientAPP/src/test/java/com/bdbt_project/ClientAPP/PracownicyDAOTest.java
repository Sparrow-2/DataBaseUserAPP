package com.bdbt_project.ClientAPP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PracownicyDAOTest {

    private PracownicyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new PracownicyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Pracownicy> listPracownicy = dao.list();

        assertFalse(listPracownicy.isEmpty());
    }
    @Test
    void testSave(){Pracownicy pracownicy = new Pracownicy();
        pracownicy.setImie_pracownika("Tomasz");
        pracownicy.setNazwisko_pracownika("Wróbel");
        pracownicy.setPESEL_pracownika("12345678901");
        pracownicy.setPlec_pracownika("M");
        pracownicy.setNr_konta("12345678901234567");
        pracownicy.setNr_telefonu_pracownika("123456789");
        pracownicy.setEmail_pracownika("wrobel@wp.pl");
        pracownicy.setData_urodzenia_pracownika(Timestamp.valueOf("2002-04-10 06:25:00"));
        pracownicy.setData_zatrudnienia(Timestamp.valueOf("2020-04-19 06:25:00"));
        pracownicy.setData_badania(Timestamp.valueOf("2020-04-21 06:25:00"));
        pracownicy.setData_waznosci_badan(Timestamp.valueOf("2021-04-21 06:25:00"));
        pracownicy.setNr_zarzadu(1);
        pracownicy.setNr_adresu(12);
        pracownicy.setNr_poczty(12);
        pracownicy.setNr_stanowiska(1);

        dao.save(pracownicy);


    }

    @Test
    void testGet() {
        int Nr_pracownika = 1;

        Pracownicy pracownicy = dao.get(Nr_pracownika);
        assertNotNull(pracownicy);
    }
    @Test
    void testUpdate() {
        Pracownicy pracownicy = new Pracownicy();
        pracownicy.setNr_pracownika(4);
        pracownicy.setImie_pracownika("Maria");
        pracownicy.setNazwisko_pracownika("Zubrzycka");
        pracownicy.setPESEL_pracownika("12345678901");
        pracownicy.setPlec_pracownika("K");
        pracownicy.setNr_konta("12345678901234567");
        pracownicy.setNr_telefonu_pracownika("123456789");
        pracownicy.setEmail_pracownika("zoszub1@wp.pl");
        pracownicy.setData_urodzenia_pracownika(Timestamp.valueOf("2003-03-13 06:25:00"));
        pracownicy.setData_zatrudnienia(Timestamp.valueOf("2020-03-13 06:25:00"));
        pracownicy.setData_badania(Timestamp.valueOf("2020-04-13 06:25:00"));
        pracownicy.setData_waznosci_badan(Timestamp.valueOf("2021-04-13 06:25:00"));
        pracownicy.setNr_zarzadu(1);
        pracownicy.setNr_adresu(12);
        pracownicy.setNr_poczty(12);
        pracownicy.setNr_stanowiska(1);
        dao.update(pracownicy);
    }

    @Test
    void testDelete() {

        dao.delete(18);
    }
}
