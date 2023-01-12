package com.bdbt_project.ClientAPP;

public class Pojazdy {
    private int Nr_pojazdu;
    private int Rok_produkcji;
    private int Liczba_miejsc;
    private boolean Czy_biletomat;
    private boolean Czy_klimatyzacja;
    private boolean Czy_monitoring;
    private boolean Czy_niskopodlogowy;
    private int  Nr_modelu;
    private int  Nr_marki;



    public Pojazdy(int Nr_pojazdu, int Rok_produkcji, int Liczba_miejsc, boolean Czy_biletomat, boolean Czy_klimatyzacja, boolean Czy_monitoring, boolean Czy_niskopodlogowy, int  Nr_modelu, int  Nr_marki) {
        super();
        this.Nr_pojazdu = Nr_pojazdu;
        this.Rok_produkcji = Rok_produkcji;
        this.Liczba_miejsc = Liczba_miejsc;
        this.Czy_biletomat = Czy_biletomat;
        this.Czy_klimatyzacja = Czy_klimatyzacja;
        this.Czy_monitoring = Czy_monitoring;
        this.Czy_niskopodlogowy = Czy_niskopodlogowy;
        this.Nr_modelu = Nr_modelu;
        this.Nr_marki = Nr_marki;
    }

    public int getNr_pojazdu() {
        return Nr_pojazdu;
    }

    public void setNr_pojazdu(int nr_pojazdu) {
        Nr_pojazdu = nr_pojazdu;
    }

    public int getRok_produkcji() {
        return Rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        Rok_produkcji = rok_produkcji;
    }

    public int getLiczba_miejsc() {
        return Liczba_miejsc;
    }

    public void setLiczba_miejsc(int liczba_miejsc) {
        Liczba_miejsc = liczba_miejsc;
    }

    public boolean isCzy_biletomat() {
        return Czy_biletomat;
    }

    public void setCzy_biletomat(boolean czy_biletomat) {
        Czy_biletomat = czy_biletomat;
    }

    public boolean isCzy_klimatyzacja() {
        return Czy_klimatyzacja;
    }

    public void setCzy_klimatyzacja(boolean czy_klimatyzacja) {
        Czy_klimatyzacja = czy_klimatyzacja;
    }

    public boolean isCzy_monitoring() {
        return Czy_monitoring;
    }

    public void setCzy_monitoring(boolean czy_monitoring) {
        Czy_monitoring = czy_monitoring;
    }

    public boolean isCzy_niskopodlogowy() {
        return Czy_niskopodlogowy;
    }

    public void setCzy_niskopodlogowy(boolean czy_niskopodlogowy) {
        Czy_niskopodlogowy = czy_niskopodlogowy;
    }

    public int getNr_modelu() {
        return Nr_modelu;
    }

    public void setNr_modelu(int nr_modelu) {
        Nr_modelu = nr_modelu;
    }

    public int getNr_marki() {
        return Nr_marki;
    }

    public void setNr_marki(int nr_marki) {
        Nr_marki = nr_marki;
    }

    @Override
    public String toString() {
        return "Pojazdy{" +
                "Nr_pojazdu=" + Nr_pojazdu +
                ", Rok_produkcji=" + Rok_produkcji +
                ", Liczba_miejsc=" + Liczba_miejsc +
                ", Czy_biletomat=" + Czy_biletomat +
                ", Czy_klimatyzacja=" + Czy_klimatyzacja +
                ", Czy_monitoring=" + Czy_monitoring +
                ", Czy_niskopodlogowy=" + Czy_niskopodlogowy +
                ", Nr_modelu=" + Nr_modelu +
                ", Nr_marki=" + Nr_marki +
                '}';
    }
}
