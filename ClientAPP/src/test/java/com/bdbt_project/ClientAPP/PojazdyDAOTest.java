package com.bdbt_project.ClientAPP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.parameters.P;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PojazdyDAOTest {
    private PojazdyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new PojazdyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Pojazdy> listPojazdy = dao.list();

        assertFalse(listPojazdy.isEmpty());
    }
    @Test
    void testSave() {
        Pojazdy pojazdy = new Pojazdy();
        pojazdy.setRok_produkcji(2003);
        pojazdy.setCzy_biletomat(true);
        pojazdy.setCzy_klimatyzacja(true);
        pojazdy.setCzy_monitoring(true);
        pojazdy.setCzy_niskopodlogowy(true);
        pojazdy.setLiczba_miejsc(80);
        pojazdy.setNr_marki(1);
        pojazdy.setNr_modelu(1);
        pojazdy.setNr_pojazdu(10);
    }
    @Test
    void testGet() {
        int nr_pojazdu = 1;

        Pojazdy pojazdy= dao.get(nr_pojazdu);
        assertNotNull(nr_pojazdu);
    }

    @Test
    void testUpdate() {

        Pojazdy pojazdy = new Pojazdy();
        pojazdy.setRok_produkcji(2003);
        pojazdy.setCzy_biletomat(true);
        pojazdy.setCzy_klimatyzacja(true);
        pojazdy.setCzy_monitoring(true);
        pojazdy.setCzy_niskopodlogowy(true);
        pojazdy.setLiczba_miejsc(80);
        pojazdy.setNr_marki(1);
        pojazdy.setNr_modelu(1);
        pojazdy.setNr_pojazdu(1);
    }

    @Test
    void testDelete() {

        dao.delete(1);    }
}
