package com.bdbt_project.ClientAPP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class BiletyDAOTest {
    private BiletyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new BiletyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Bilety> listBilety = dao.list();

        assertFalse(listBilety.isEmpty());
    }
    @Test
    void testSave() {
        Bilety bilety = new Bilety();
        bilety.setNr_biletu(10);
        bilety.setCena((float) 3.8);
        bilety.setNr_zarzadu(1);
        bilety.setCzas_skasowania(Timestamp.valueOf("2023-01-03 13:00:00"));
        bilety.setCzy_ulgowy(true);
        bilety.setKoniec_waznosci(Timestamp.valueOf("2023-01-04 13:00:00"));
        bilety.setRodzaj_biletu("DOBOWY");
        dao.save(bilety);

    }
    @Test
    void testGet() {
        int nr_biletu = 1;

        Bilety bilety = dao.get(nr_biletu);
        assertNotNull(bilety);
    }

    @Test
    void testUpdate() {
        Bilety bilety = new Bilety();
        bilety.setNr_biletu(1);
        bilety.setCena((float) 3.8);
        bilety.setNr_zarzadu(1);
        bilety.setCzas_skasowania(Timestamp.valueOf("2023-01-03 13:00:00"));
        bilety.setCzy_ulgowy(true);
        bilety.setKoniec_waznosci(Timestamp.valueOf("2023-01-04 13:00:00"));
        bilety.setRodzaj_biletu("DOBOWY");
        dao.save(bilety);
    }

    @Test
    void testDelete() {

        dao.delete(1);
    }
}
