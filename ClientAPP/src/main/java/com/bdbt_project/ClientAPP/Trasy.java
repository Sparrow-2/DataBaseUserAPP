package com.bdbt_project.ClientAPP;

public class Trasy {
    private int Nr_trasy;
    private int Dlugosc;
    private String Przystanek_poczatkowy;
    private String Przystanek_koncowy;
    private int Nr_zarzadu;

    public Trasy(){

    }

    public Trasy(int nr_trasy, int dlugosc, String przystanek_poczatkowy, String przystanek_koncowy, int nr_zarzadu) {
        Nr_trasy = nr_trasy;
        Dlugosc = dlugosc;
        Przystanek_poczatkowy = przystanek_poczatkowy;
        Przystanek_koncowy = przystanek_koncowy;
        Nr_zarzadu = nr_zarzadu;
    }

    public int getNr_zarzadu() {
        return Nr_zarzadu;
    }

    public void setNr_zarzadu(int nr_zarzadu) {
        Nr_zarzadu = nr_zarzadu;
    }

    public int getNr_trasy() {
        return Nr_trasy;
    }

    public void setNr_trasy(int nr_trasy) {
        Nr_trasy = nr_trasy;
    }

    public int getDlugosc() {
        return Dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        Dlugosc = dlugosc;
    }

    public String getPrzystanek_poczatkowy() {
        return Przystanek_poczatkowy;
    }

    public void setPrzystanek_poczatkowy(String przystanek_poczatkowy) {
        Przystanek_poczatkowy = przystanek_poczatkowy;
    }

    public String getPrzystanek_koncowy() {
        return Przystanek_koncowy;
    }

    public void setPrzystanek_koncowy(String przystanek_koncowy) {
        Przystanek_koncowy = przystanek_koncowy;
    }

    @Override
    public String toString() {
        return "Trasy{" +
                "Nr_trasy=" + Nr_trasy +
                ", Dlugosc=" + Dlugosc +
                ", Przystanek_poczatkowy='" + Przystanek_poczatkowy + '\'' +
                ", Przystanek_koncowy='" + Przystanek_koncowy + '\'' +
                ", Nr_zarzadu=" + Nr_zarzadu +
                '}';
    }
}

