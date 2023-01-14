package com.bdbt_project.ClientAPP;


import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

import javax.xml.crypto.Data;
import java.sql.Timestamp;


public class Pracownicy {
    private int Nr_pracownika;
    private String Imie_pracownika;
    private String Nazwisko_pracownika;
    private String PESEL_pracownika;
    private String Plec_pracownika;
    private String Nr_konta;
    private String Nr_telefonu_pracownika;
    private String Email_pracownika;
    private Timestamp Data_urodzenia_pracownika;
    private Timestamp Data_zatrudnienia_pracownika;
    private Timestamp Data_badania;
    private Timestamp Data_waznosci_badan;
    private int Nr_zarzadu;
    private int Nr_adresu;
    private int Nr_poczty;
    private int Nr_stanowiska;

    public Pracownicy(){

    }

    public Pracownicy(String imie_pracownika, String nazwisko_pracownika, String PESEL_pracownika, String plec_pracownika, String nr_konta, String nr_telefonu_pracownika, String email_pracownika, Timestamp data_urodzenia_pracownika, Timestamp data_zatrudnienia_pracownika, Timestamp data_badania, Timestamp data_waznosci_badan, int nr_zarzadu, int nr_adresu, int nr_poczty, int nr_stanowiska) {
        this.Imie_pracownika = imie_pracownika;
        this.Nazwisko_pracownika = nazwisko_pracownika;
        this.PESEL_pracownika = PESEL_pracownika;
        this.Plec_pracownika = plec_pracownika;
        this.Nr_konta = nr_konta;
        this.Nr_telefonu_pracownika = nr_telefonu_pracownika;
        this.Email_pracownika = email_pracownika;
        this.Data_urodzenia_pracownika = data_urodzenia_pracownika;
        this.Data_zatrudnienia_pracownika = data_zatrudnienia_pracownika;
        this.Data_badania = data_badania;
        this.Data_waznosci_badan = data_waznosci_badan;
        this.Nr_zarzadu = nr_zarzadu;
        this.Nr_adresu = nr_adresu;
        this.Nr_poczty = nr_poczty;
        this.Nr_stanowiska = nr_stanowiska;
    }

    public int getNr_pracownika() {
        return Nr_pracownika;
    }

    public void setNr_pracownika(int nr_pracownika) {
        Nr_pracownika = nr_pracownika;
    }

    public String getImie_pracownika() {
        return Imie_pracownika;
    }

    public void setImie_pracownika(String imie_pracownika) {
        Imie_pracownika = imie_pracownika;
    }

    public String getNazwisko_pracownika() {
        return Nazwisko_pracownika;
    }

    public void setNazwisko_pracownika(String nazwisko_pracownika) {
        Nazwisko_pracownika = nazwisko_pracownika;
    }

    public String getPESEL_pracownika() {
        return PESEL_pracownika;
    }

    public void setPESEL_pracownika(String PESEL_pracownika) {
        this.PESEL_pracownika = PESEL_pracownika;
    }

    public String getPlec_pracownika() {
        return Plec_pracownika;
    }

    public void setPlec_pracownika(String plec_pracownika) {
        Plec_pracownika = plec_pracownika;
    }

    public String getNr_konta() {
        return Nr_konta;
    }

    public void setNr_konta(String nr_konta) {
        Nr_konta = nr_konta;
    }

    public String getNr_telefonu_pracownika() {
        return Nr_telefonu_pracownika;
    }

    public void setNr_telefonu_pracownika(String nr_telefonu_pracownika) {
        Nr_telefonu_pracownika = nr_telefonu_pracownika;
    }

    public String getEmail_pracownika() {
        return Email_pracownika;
    }

    public void setEmail_pracownika(String email_pracownika) {
        Email_pracownika = email_pracownika;
    }

    public Timestamp getData_urodzenia_pracownika() {
        return Data_urodzenia_pracownika;
    }

    public void setData_urodzenia_pracownika(Timestamp data_urodzenia_pracownika) {
        Data_urodzenia_pracownika = data_urodzenia_pracownika;
    }

    public Timestamp getData_zatrudnienia_pracownika() {
        return Data_zatrudnienia_pracownika;
    }

    public void setData_zatrudnienia_pracownika(Timestamp data_zatrudnienia_pracownika) {
        Data_zatrudnienia_pracownika = data_zatrudnienia_pracownika;
    }

    public Timestamp getData_badania() {
        return Data_badania;
    }

    public void setData_badania(Timestamp data_badania) {
        Data_badania = data_badania;
    }

    public Timestamp getData_waznosci_badan() {
        return Data_waznosci_badan;
    }

    public void setData_waznosci_badan(Timestamp data_waznosci_badan) {
        Data_waznosci_badan = data_waznosci_badan;
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

    public int getNr_stanowiska() {
        return Nr_stanowiska;
    }

    public void setNr_stanowiska(int nr_stanowiska) {
        Nr_stanowiska = nr_stanowiska;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "Nr_pracownika=" + Nr_pracownika +
                ", Imie_pracownika='" + Imie_pracownika + '\'' +
                ", Nazwisko_pracownika='" + Nazwisko_pracownika + '\'' +
                ", PESEL_pracownika='" + PESEL_pracownika + '\'' +
                ", Plec_pracownika='" + Plec_pracownika + '\'' +
                ", Nr_konta='" + Nr_konta + '\'' +
                ", Nr_telefonu_pracownika='" + Nr_telefonu_pracownika + '\'' +
                ", Email_pracownika='" + Email_pracownika + '\'' +
                ", Data_urodzenia_pracownika=" + Data_urodzenia_pracownika +
                ", Data_zatrudnienia_pracownika=" + Data_zatrudnienia_pracownika +
                ", Data_badania=" + Data_badania +
                ", Data_waznosci_badan=" + Data_waznosci_badan +
                ", Nr_zarzadu=" + Nr_zarzadu +
                ", Nr_adresu=" + Nr_adresu +
                ", Nr_poczty=" + Nr_poczty +
                ", Nr_stanowiska=" + Nr_stanowiska +
                '}';
    }
}
