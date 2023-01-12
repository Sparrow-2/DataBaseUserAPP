package com.bdbt_project.ClientAPP;

import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

import javax.xml.crypto.Data;
import java.sql.Timestamp;

public class Klient {
    private int Nr_klienta;
    private String Imie_klienta;
    private String Nazwisko_klienta;
    private String Plec_klienta;
    private Timestamp Data_urodzenia_klienta;
    private String PESEL_klienta;

    private String Email_klienta;
    private String Nr_telefonu_klienta;
    private int Nr_zarzadu;
    private int Nr_adresu;
    private int Nr_poczty;

  public Klient(){

  }

    public Klient(String imie_klienta, String nazwisko_klienta, String plec_klienta, Timestamp data_urodzenia_klienta, String PESEL_klienta,  String email_klienta, String nr_telefonu_klienta, int nr_zarzadu, int nr_adresu, int nr_poczty) {
        super();
        this.Imie_klienta = imie_klienta;
        this.Nazwisko_klienta = nazwisko_klienta;
        this.Plec_klienta = plec_klienta;
        this.Data_urodzenia_klienta = data_urodzenia_klienta;
        this.PESEL_klienta = PESEL_klienta;

        this.Email_klienta = email_klienta;
        this.Nr_telefonu_klienta = nr_telefonu_klienta;
        this.Nr_zarzadu = nr_zarzadu;
        this.Nr_adresu = nr_adresu;
        this.Nr_poczty = nr_poczty;
    }

    public int getNr_klienta() {
        return Nr_klienta;
    }

    public void setNr_klienta(int nr_klienta) {
        Nr_klienta = nr_klienta;
    }

    public String getImie_klienta() {
        return Imie_klienta;
    }

    public void setImie_klienta(String imie_klienta) {
        Imie_klienta = imie_klienta;
    }

    public String getNazwisko_klienta() {
        return Nazwisko_klienta;
    }

    public void setNazwisko_klienta(String nazwisko_klienta) {
        Nazwisko_klienta = nazwisko_klienta;
    }

    public String getPlec_klienta() {
        return Plec_klienta;
    }

    public void setPlec_klienta(String plec_klienta) {
        Plec_klienta = plec_klienta;
    }

    public Timestamp getData_urodzenia_klienta() {
        return Data_urodzenia_klienta;
    }

    public void setData_urodzenia_klienta(Timestamp data_urodzenia_klienta) {
        Data_urodzenia_klienta = data_urodzenia_klienta;
    }

    public String getPESEL_klienta() {
        return PESEL_klienta;
    }

    public void setPESEL_klienta(String PESEL_klienta) {
        this.PESEL_klienta = PESEL_klienta;
    }




    public String getEmail_klienta() {
        return Email_klienta;
    }

    public void setEmail_klienta(String email_klienta) {
        Email_klienta = email_klienta;
    }

    public String getNr_telefonu_klienta() {
        return Nr_telefonu_klienta;
    }

    public void setNr_telefonu_klienta(String nr_telefonu_klienta) {
        Nr_telefonu_klienta = nr_telefonu_klienta;
    }

    public int getNr_zarzadu() {
        return Nr_zarzadu;
    }

    public void setNr_zarzadu(int nr_zarzadu) {
        Nr_zarzadu = nr_zarzadu;
    }

    public int getNr_adresu() {
        return Nr_adresu;
    }

    public void setNr_adresu(int nr_adresu) {
        Nr_adresu = nr_adresu;
    }

    public int getNr_poczty() {
        return Nr_poczty;
    }

    public void setNr_poczty(int nr_poczty) {
        Nr_poczty = nr_poczty;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "Nr_klienta=" + Nr_klienta +
                ", Imie_klienta='" + Imie_klienta + '\'' +
                ", Nazwisko_klienta='" + Nazwisko_klienta + '\'' +
                ", Plec_klienta='" + Plec_klienta + '\'' +
                ", Data_urodzenia_klienta=" + Data_urodzenia_klienta +
                ", PESEL_klienta='" + PESEL_klienta + '\'' +

                ", Email_klienta='" + Email_klienta + '\'' +
                ", Nr_telefonu_klienta='" + Nr_telefonu_klienta + '\'' +
                ", Nr_zarzadu=" + Nr_zarzadu +
                ", Nr_adresu=" + Nr_adresu +
                ", Nr_poczty=" + Nr_poczty +
                '}';
    }
}


