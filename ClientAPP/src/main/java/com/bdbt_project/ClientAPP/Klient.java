package com.bdbt_project.ClientAPP;

import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

import javax.xml.crypto.Data;

public class Klient {
    private int Nr_klienta;
    private String Imie_klienta;
    private String Nazwisko_klienta;
    private String Plec_klienta;
    private String Data_urodzenia_klienta;
    private String PESEL_klienta;
    private String Adres_klienta;
    private String Email_klienta;
    private String Nr_telefonu_klienta;
    private int Nr_zarzadu;
    private int Nr_adresu;
    private int Nr_poczty;

    public  Klient() {

    }
    public Klient(String Imie_klienta, String Nazwisko_klienta, String Plec_klienta, String Data_urodzenia_klienta, String PESEL_klienta, String Adres_klienta, String Email_klienta, String Nr_telefonu_klienta, int Nr_zarzadu, int Nr_adresu, int Nr_poczty) {
        super();
        this.Imie_klienta = Imie_klienta;
        this.Nazwisko_klienta = Nazwisko_klienta;
        this.Plec_klienta = Plec_klienta;
        this.Data_urodzenia_klienta = Data_urodzenia_klienta;
        this.PESEL_klienta = PESEL_klienta;
        this.Adres_klienta = Adres_klienta;
        this.Email_klienta = Email_klienta;
        this.Nr_telefonu_klienta = Nr_telefonu_klienta;
        this.Nr_zarzadu =Nr_zarzadu;
        this.Nr_adresu = Nr_adresu;
        this.Nr_poczty = Nr_poczty;
    }

    public int getNr_klienta(){
        return Nr_klienta;
    }
    public void setNr_klienta(int Nr_klienta){
        this.Nr_klienta = Nr_klienta;
    }

    public String getImie_klienta(){
        return Imie_klienta;
    }
    public void setImie_klienta(String Imie_klienta){
        this.Imie_klienta = Imie_klienta;
    }

    public String getNazwisko_klienta(){
        return Nazwisko_klienta;
    }
    public void setNazwisko_klienta(String Nazwisko_klienta){
        this.Nazwisko_klienta = Nazwisko_klienta;
    }

    public String getPlec_klienta(){
        return Plec_klienta;
    }
    public void setPlec_klienta(String Plec_klienta){
        this.Plec_klienta = Plec_klienta;
    }

    public String getData_urodzenia_klienta(){
        return Data_urodzenia_klienta;
    }
    public void setData_urodzenia_klienta(String Data_urodzenia_klienta){
        this.Data_urodzenia_klienta = Data_urodzenia_klienta;
    }

    public String getPESEL_klienta(){
        return PESEL_klienta;
    }
    public void setPESEL_klienta(String PESEL_klienta){
        this.PESEL_klienta = PESEL_klienta;
    }

    public String getAdres_klienta(){
        return Adres_klienta;
    }
    public void setAdres_klienta(String Adres_klienta){
        this.Adres_klienta = Adres_klienta;
    }
    public String getEmail_klienta(){
        return Email_klienta;
    }
    public void setEmail_klienta(String Email_klienta){
        this.Email_klienta = Email_klienta;
    }
    public String getNr_telefonu_klienta(){
        return Nr_telefonu_klienta;
    }
    public void setNr_telefonu_klienta(String Nr_telefonu_klienta){
        this.Nr_telefonu_klienta = Nr_telefonu_klienta;
    }

    public int getNr_zarzadu(){
        return Nr_zarzadu;
    }
    public void setNr_zarzadu(int Nr_zarzadu){
        this.Nr_zarzadu = Nr_zarzadu;
    }

    public int getNr_adresu(){
        return Nr_adresu;
    }
    public void setNr_adresu(int Nr_adresu){
        this.Nr_adresu = Nr_adresu;
    }

    public int getNr_poczty(){
        return Nr_poczty;
    }
    public void setNr_poczty(int Nr_poczty){
        this.Nr_poczty= Nr_poczty;
    }



    @Override
    public String toString() {
        return "Klient [Nr_klienta=" + Nr_klienta + ", Imie_klienta=" + Imie_klienta + ", Nazwisko_klienta=" + Nazwisko_klienta + ", Plec_klienta=" + Plec_klienta + ", Data_urodzenia_klienta=" + Data_urodzenia_klienta + ", PESEL_klienta=" + PESEL_klienta + ", Adres_klienta=" + Adres_klienta + ", Email_klienta=" + Email_klienta + ", Nr_telefonu_klienta=" + Nr_telefonu_klienta + ", Nr_zarzadu=" + Nr_zarzadu + ", Nr_adresu=" + Nr_adresu + ", Nr_poczty=" + Nr_poczty +"]";
    }
}



