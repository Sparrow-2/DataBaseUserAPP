package com.bdbt_project.ClientAPP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TrasyDAOTest {
    private TrasyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new TrasyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Trasy> listTrasy = dao.list();

        assertFalse(listTrasy.isEmpty());
    }
    @Test
    void testSave() {
        Trasy trasy = new Trasy();
        trasy.setNr_trasy(6);
        trasy.setDlugosc(3);
        trasy.setPrzystanek_koncowy("MŁOCINY");
        trasy.setPrzystanek_poczatkowy("STARE BIELANY");
        dao.save(trasy);

    }
    @Test
    void testGet() {

        int nr_trasy = 1;

        Trasy trasy = dao.get(nr_trasy);
        assertNotNull(trasy);
    }

    @Test
    void testUpdate() {
        Trasy trasy = new Trasy();
        trasy.setNr_trasy(1);
        trasy.setDlugosc(3);
        trasy.setPrzystanek_koncowy("MŁOCINY");
        trasy.setPrzystanek_poczatkowy("STARE BIELANY");
        dao.save(trasy);

    }

    @Test
    void testDelete() {

        dao.delete(1);
    }
}
