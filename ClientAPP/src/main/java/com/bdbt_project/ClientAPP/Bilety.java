package com.bdbt_project.ClientAPP;

import java.sql.Timestamp;

public class Bilety {
    private int Nr_biletu;
    private String Rodzaj_biletu;
    private Timestamp Czas_skasowania;
    private Timestamp Koniec_waznosci;
    private boolean Czy_ulgowy;
    private float Cena;
    private int Nr_zarzadu;
    private int Nr_klienta;


    public  Bilety() {

    }

    public Bilety(String rodzaj_biletu, Timestamp czas_skasowania, Timestamp koniec_waznosci, boolean czy_ulgowy, float cena, int nr_zarzadu, int nr_klienta) {
        super();
        this.Rodzaj_biletu = rodzaj_biletu;
        this.Czas_skasowania = czas_skasowania;
        this.Koniec_waznosci = koniec_waznosci;
        this.Czy_ulgowy = czy_ulgowy;
        this.Cena = cena;
        this.Nr_zarzadu = nr_zarzadu;
        this.Nr_klienta = nr_klienta;
    }



    public int getNr_biletu() {
        return Nr_biletu;
    }

    public void setNr_biletu(int nr_biletu) {
        Nr_biletu = nr_biletu;
    }

    public String getRodzaj_biletu() {
        return Rodzaj_biletu;
    }

    public void setRodzaj_biletu(String rodzaj_biletu) {
        Rodzaj_biletu = rodzaj_biletu;
    }

    public Timestamp getCzas_skasowania() {
        return Czas_skasowania;
    }

    public void setCzas_skasowania(Timestamp czas_skasowania) {
        Czas_skasowania = czas_skasowania;
    }

    public Timestamp getKoniec_waznosci() {
        return Koniec_waznosci;
    }

    public void setKoniec_waznosci(Timestamp koniec_waznosci) {
        Koniec_waznosci = koniec_waznosci;
    }

    public boolean isCzy_ulgowy() {
        return Czy_ulgowy;
    }

    public void setCzy_ulgowy(boolean czy_ulgowy) {
        Czy_ulgowy = czy_ulgowy;
    }

    public float getCena() {
        return Cena;
    }

    public void setCena(float cena) {
        Cena = cena;
    }

    public int getNr_zarzadu() {
        return Nr_zarzadu;
    }

    public void setNr_zarzadu(int nr_zarzadu) {
        Nr_zarzadu = nr_zarzadu;
    }

    public int getNr_klienta() {
        return Nr_klienta;
    }

    public void setNr_klienta(int nr_klienta) {
        Nr_klienta = nr_klienta;
    }

    @Override
    public String toString() {
        return "Bilety{" +
                "Nr_biletu=" + Nr_biletu +
                ", Rodzaj_biletu='" + Rodzaj_biletu + '\'' +
                ", Czas_skasowania=" + Czas_skasowania +
                ", Koniec_waznosci=" + Koniec_waznosci +
                ", Czy_ulgowy=" + Czy_ulgowy +
                ", Cena=" + Cena +
                ", Nr_zarzadu=" + Nr_zarzadu +
                ", Nr_klienta=" + Nr_klienta +
                '}';
    }
}
