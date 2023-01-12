package com.bdbt_project.ClientAPP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdresyDAOTest {
    private AdresyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new AdresyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Adresy> listAdresy = dao.list();

        assertFalse(listAdresy.isEmpty());
    }
    @Test
    void testSave() {
        Adresy adresy = new Adresy("Lublin","Północna","1","2",2);
        adresy.setNr_adresu(24);
        dao.save(adresy);
    }
    @Test
    void testGet() {
        int nr_adresu = 1;

        Adresy adresy = dao.get(nr_adresu);
        assertNotNull(adresy);
    }

    @Test
    void testUpdate() {
        Adresy adresy = new Adresy("Lublin","Północna","1","2",2);
        adresy.setNr_adresu(2);
        dao.save(adresy);
    }

    @Test
    void testDelete() {
        dao.delete(1);
    }
}
