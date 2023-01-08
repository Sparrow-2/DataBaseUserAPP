package com.bdbt_project.ClientAPP;

import java.util.Set;

public class Producent {
    private int nr_marki;
    private String nazwa_marki;

    private Set<Vehicle> vehicleSet;

    public void setNr_marki(int nr_marki) {
        this.nr_marki = nr_marki;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "nr_marki=" + nr_marki +
                ", nazwa_marki='" + nazwa_marki + '\'' +
                ", vehicleSet=" + vehicleSet +
                '}';
    }

    public Producent(int nr_marki, String nazwa_marki, Set<Vehicle> vehicleSet) {
        this.nr_marki = nr_marki;
        this.nazwa_marki = nazwa_marki;
        this.vehicleSet = vehicleSet;
    }

    public void setNazwa_marki(String nazwa_marki) {
        this.nazwa_marki = nazwa_marki;
    }

    public void setVehicleSet(Set<Vehicle> vehicleSet) {
        this.vehicleSet = vehicleSet;
    }

    public int getNr_marki() {
        return nr_marki;
    }

    public String getNazwa_marki() {
        return nazwa_marki;
    }

    public Set<Vehicle> getVehicleSet() {
        return vehicleSet;
    }
}
