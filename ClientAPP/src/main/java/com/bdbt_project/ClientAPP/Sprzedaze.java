package com.bdbt_project.ClientAPP;

import java.sql.Timestamp;

public class Sprzedaze {
    private int Nr_biletu;
    private Timestamp Data_sprzedazy;

    public Sprzedaze(){

    }

    public Sprzedaze(Timestamp data_sprzedazy) {
        this.Data_sprzedazy = data_sprzedazy;
    }

    public int getNr_biletu() {
        return Nr_biletu;
    }

    public void setNr_biletu(int nr_biletu) {
        Nr_biletu = nr_biletu;
    }

    public Timestamp getData_sprzedazy() {
        return Data_sprzedazy;
    }

    public void setData_sprzedazy(Timestamp data_sprzedazy) {
        Data_sprzedazy = data_sprzedazy;
    }

    @Override
    public String toString() {
        return "Sprzedaze{" +
                ", Nr_biletu=" + Nr_biletu +
                ", Data_sprzedazy=" + Data_sprzedazy +
                '}';
    }
}
