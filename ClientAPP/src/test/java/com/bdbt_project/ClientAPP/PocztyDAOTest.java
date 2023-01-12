package com.bdbt_project.ClientAPP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PocztyDAOTest {

    private PocztyDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new PocztyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Poczty> listPoczty = dao.list();

        assertFalse(listPoczty.isEmpty());
    }
    @Test
    void testSave() {
        Poczty poczty = new Poczty("20-670","Lublin");
        poczty.setNr_poczty(10);
        dao.save(poczty);
    }
    @Test
    void testGet() {
        int nr_poczty = 1;

        Poczty poczty = dao.get(nr_poczty);
        assertNotNull(poczty);
    }

    @Test
    void testUpdate() {
        Poczty poczty = new Poczty("20-670","Lublin");
        poczty.setNr_poczty(1);
        dao.update(poczty);
    }

    @Test
    void testDelete() {

        dao.delete(1);
    }
}
