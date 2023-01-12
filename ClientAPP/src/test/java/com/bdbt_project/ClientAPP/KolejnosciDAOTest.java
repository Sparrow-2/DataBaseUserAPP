package com.bdbt_project.ClientAPP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class KolejnosciDAOTest {

    private KolejnosciDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new KolejnosciDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Kolejnosci> listKolejnosci = dao.list();

        assertFalse(listKolejnosci.isEmpty());
    }
    @Test
    void testSave() {
       Kolejnosci kolejnosci = new Kolejnosci();
       kolejnosci.setNr_kolejnosc(6);
       kolejnosci.setNr_przystanku(1);
       kolejnosci.setNr_trasy(1);
       dao.save(kolejnosci);
    }
    @Test
    void testGet() {
        int nr_kolejnosci = 1;

        Kolejnosci kolejnosci = dao.get(nr_kolejnosci);
        assertNotNull(kolejnosci);
    }

    @Test
    void testUpdate() {
        Kolejnosci kolejnosci = new Kolejnosci();
        kolejnosci.setNr_kolejnosc(1);
        kolejnosci.setNr_przystanku(1);
        kolejnosci.setNr_trasy(1);
        dao.save(kolejnosci);
    }

    @Test
    void testDelete() {

        dao.delete(1);
    }
}
