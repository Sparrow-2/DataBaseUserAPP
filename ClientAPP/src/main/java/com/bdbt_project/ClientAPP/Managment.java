package com.bdbt_project.ClientAPP;

public class Managment {
    public int nr_zarzadu;
    public String nazwa_zarzadu;

    public int getNr_zarzadu() {
        return nr_zarzadu;
    }

    public void setNr_zarzadu(int nr_zarzadu) {
        this.nr_zarzadu = nr_zarzadu;
    }

    public String getNazwa_zarzadu() {
        return nazwa_zarzadu;
    }

    public void setNazwa_zarzadu(String nazwa_zarzadu) {
        this.nazwa_zarzadu = nazwa_zarzadu;
    }

    @Override
    public String toString() {
        return "Managment{" +
                "nr_zarzadu=" + nr_zarzadu +
                ", nazwa_zarzadu='" + nazwa_zarzadu + '\'' +
                '}';
    }
}
