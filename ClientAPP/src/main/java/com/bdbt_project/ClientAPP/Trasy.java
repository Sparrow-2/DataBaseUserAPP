package com.bdbt_project.ClientAPP;

public class Trasy {
    private int Nr_trasy;
    private int Dlugosc;
    private String Przystanek_poczatkowy;
    private String Przystanek_koncowy;

    public Trasy(){

    }

    public Trasy(int dlugosc, String przystanek_poczatkowy, String przystanek_koncowy) {
        super();
        this.Dlugosc = dlugosc;
        this.Przystanek_poczatkowy = przystanek_poczatkowy;
        this.Przystanek_koncowy = przystanek_koncowy;
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
                '}';
    }
}

