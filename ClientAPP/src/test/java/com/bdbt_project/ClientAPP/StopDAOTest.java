package com.bdbt_project.ClientAPP;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StopDAOTest {
    private StopDAO dao;
    @BeforeEach
    void setUp () throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        dataSource.setUsername("BDBTGRC13");
        dataSource.setPassword("BDBTGRC13");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new StopDAO(new JdbcTemplate(dataSource));
    }
    @Test
    void testList(){
        List<Stop> listStops = dao.list();
        assertFalse(listStops.isEmpty());
    }
    @Test
    void testGet(){
        int nr_przystanku = 1;
        char rodzaj_przystanku = 'A';
        Stop stop = dao.get(nr_przystanku);
        assertNotNull(stop);
    }
    @Test
    void testGetatr(){
        int nr_przystanku = 1;
        String nazwa_przystanku = "KABATY01";
        char rodzaj_przystanku = 'A';
        Stop stop = dao.get_atr(nazwa_przystanku);
        assertNotNull(stop);
    }
    @Test
    void testSave(){

        Stop stop = new Stop(15,"MŁYNÓW01",'A',true,true,true,1);
        dao.save(stop);
    }
    @Test
    void testUpdate() {
        Stop stop = new Stop(1,"MŁYNÓW01",'A',true,true,true,1);

        dao.update(stop);
    }


    @Test
    void testDelete() {

        dao.delete(1);
    }

}
