package com.bdbt_project.ClientAPP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SprzedazeDAOTest {
    private SprzedazeDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new SprzedazeDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Sprzedaze> listSprzedaze = dao.list();

        assertFalse(listSprzedaze.isEmpty());
    }
    @Test
    void testSave() {
        Sprzedaze sprzedaze = new Sprzedaze();
        sprzedaze.setNr_biletu(3);
        sprzedaze.setData_sprzedazy(Timestamp.valueOf("2023-01-03 12:00:00"));

    }
    @Test
    void testGet() {
        int nr_sprzedazy = 1;

        Sprzedaze sprzedaze = dao.get(nr_sprzedazy);
        assertNotNull(sprzedaze);
    }

    @Test
    void testUpdate() {
        Sprzedaze sprzedaze = new Sprzedaze();
        sprzedaze.setNr_biletu(1);
        sprzedaze.setData_sprzedazy(Timestamp.valueOf("2023-01-03 12:00:00"));
        dao.update(sprzedaze);
    }

    @Test
    void testDelete() {

        dao.delete(1);
    }
}
