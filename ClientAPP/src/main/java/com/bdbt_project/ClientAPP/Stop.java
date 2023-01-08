package com.bdbt_project.ClientAPP;

public class Stop {
    private int nr_przystanku;
    private String nazwa_przystanku;
    private char rodzaj_przystanku;
    private boolean czy_biletomat;
    private boolean czy_ekran;
    private boolean czy_wiata;

    public int getNr_przystanku() {
        return nr_przystanku;
    }

    public void setNr_przystanku(int nr_przystanku) {
        this.nr_przystanku = nr_przystanku;
    }

    public String getNazwa_przystanku() {
        return nazwa_przystanku;
    }

    public void setNazwa_przystanku(String nazwa_przystanku) {
        this.nazwa_przystanku = nazwa_przystanku;
    }

    public char getRodzaj_przystanku() {
        return rodzaj_przystanku;
    }

    public void setRodzaj_przystanku(char rodzaj_przystanku) {
        this.rodzaj_przystanku = rodzaj_przystanku;
    }

    public boolean isCzy_biletomat() {
        return czy_biletomat;
    }

    public void setCzy_biletomat(boolean czy_biletomat) {
        this.czy_biletomat = czy_biletomat;
    }

    public boolean isCzy_ekran() {
        return czy_ekran;
    }

    public void setCzy_ekran(boolean czy_ekran) {
        this.czy_ekran = czy_ekran;
    }

    public boolean isCzy_wiata() {
        return czy_wiata;
    }

    public void setCzy_wiata(boolean czy_wiata) {
        this.czy_wiata = czy_wiata;
    }

    @Override
    public String toString() {
        return "Stop{" +
                "nr_przystanku=" + nr_przystanku +
                ", nazwa_przystanku='" + nazwa_przystanku + '\'' +
                ", rodzaj_przystanku=" + rodzaj_przystanku +
                ", czy_biletomat=" + czy_biletomat +
                ", czy_ekran=" + czy_ekran +
                ", czy_wiata=" + czy_wiata +
                '}';
    }
}
