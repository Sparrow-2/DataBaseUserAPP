package com.bdbt_project.ClientAPP;

public class Poczty {
    private int Nr_poczty;
    private String Kod_pocztowy;
    private String Poczta;


    public  Poczty() {

    }
    public Poczty(String Kod_pocztowy, String Poczta) {
        super();
        this.Kod_pocztowy = Kod_pocztowy;
        this.Poczta = Poczta;

    }

    public int getNr_poczty(){
        return Nr_poczty;
    }
    public void setNr_poczty(int Nr_poczty){
        this.Nr_poczty = Nr_poczty;
    }

    public String getKod_pocztowy(){
        return Kod_pocztowy;
    }
    public void setKod_pocztowy(String Kod_pocztowy){
        this.Kod_pocztowy = Kod_pocztowy;
    }

    public String getPoczta(){
        return Poczta;
    }
    public void setPoczta(String Poczta){
        this.Poczta = Poczta;
    }


    @Override
    public String toString() {
        return "Poczty [Nr_poczty=" + Nr_poczty + ", Kod_pocztowy=" + Kod_pocztowy + ", Poczta=" + Poczta +"]";
    }
}
