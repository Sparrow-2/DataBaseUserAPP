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

public class KlientDAOTest {
    private KlientDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRC13");
        datasource.setPassword("BDBTGRC13");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new KlientDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        List<Klient> listKlient = dao.list();

        assertFalse(listKlient.isEmpty());
    }
    @Test
    void testSave(){Klient klient = new Klient();
            klient.setImie_klienta("Zofia");
            klient.setNazwisko_klienta("Zubrzycka");
            klient.setEmail_klienta("zoszub1@wp.pl");
            klient.setNr_klienta(18);
            klient.setNr_adresu(12);
            klient.setNr_poczty(12);
            klient.setNr_zarzadu(1);
            klient.setNr_telefonu_klienta("+48600600600");
            klient.setPESEL_klienta("00000000000");
            klient.setPlec_klienta("K");
            klient.setData_urodzenia_klienta(Timestamp.valueOf("2003-03-13 06:25:00"));
            dao.save(klient);


    }

    @Test
    void testGet() {
        int nr_klienta = 1;

        Klient klient = dao.get(nr_klienta);
        assertNotNull(klient);
    }
    @Test
    void testUpdate() {
        Klient klient = new Klient();
        klient.setNr_klienta(18);
        klient.setImie_klienta("Zosia");
        klient.setNazwisko_klienta("Zubrzycka");
        klient.setEmail_klienta("zoszub1@wp.pl");
        klient.setNr_adresu(12);
        klient.setNr_poczty(12);
        klient.setNr_zarzadu(1);
        klient.setNr_telefonu_klienta("+48600600600");
        klient.setPESEL_klienta("00000000000");
        klient.setPlec_klienta("K");
        klient.setData_urodzenia_klienta(Timestamp.valueOf("2003-03-13 06:25:00"));
        dao.update(klient);
    }

    @Test
    void testDelete() {

        dao.delete(18);
    }
}
