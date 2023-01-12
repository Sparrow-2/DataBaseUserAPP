package com.bdbt_project.ClientAPP;

public class Kolejnosci {
    private int Nr_trasy;
    private int Nr_przystanku;
    private int Nr_kolejnosc;

    public Kolejnosci() {

    }

    public Kolejnosci(int nr_przystanku, int nr_kolejnosc) {
        this.Nr_przystanku = nr_przystanku;
        this.Nr_kolejnosc = nr_kolejnosc;
    }

    public int getNr_trasy() {
        return Nr_trasy;
    }

    public void setNr_trasy(int nr_trasy) {
        Nr_trasy = nr_trasy;
    }

    public int getNr_przystanku() {
        return Nr_przystanku;
    }

    public void setNr_przystanku(int nr_przystanku) {
        Nr_przystanku = nr_przystanku;
    }

    public int getNr_kolejnosc() {
        return Nr_kolejnosc;
    }

    public void setNr_kolejnosc(int nr_kolejnosc) {
        Nr_kolejnosc = nr_kolejnosc;
    }

    @Override
    public String toString() {
        return "Kolejnosci{" +
                "Nr_trasy=" + Nr_trasy +
                ", Nr_przystanku=" + Nr_przystanku +
                ", Nr_kolejnosc=" + Nr_kolejnosc +
                '}';
    }
}
