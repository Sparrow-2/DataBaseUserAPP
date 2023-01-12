package com.bdbt_project.ClientAPP;

public class
Adresy {
    private int Nr_adresu;
    private String Miasto;
    private String Ulica;
    private String Nr_domu;
    private String Nr_lokalu;
    private int Nr_poczty;

    public  Adresy() {

    }
    public Adresy(String Miasto, String Ulica, String Nr_domu, String Nr_lokalu, int Nr_poczty) {
        super();
        this.Miasto = Miasto;
        this.Ulica = Ulica;
        this.Nr_domu = Nr_domu;
        this.Nr_lokalu = Nr_lokalu;
        this.Nr_poczty = Nr_poczty;
    }

    public int getNr_adresu(){
        return Nr_adresu;
    }
    public void setNr_adresu(int Nr_adresu){
        this.Nr_adresu = Nr_adresu;
    }

    public String getMiasto(){
        return Miasto;
    }
    public void setMiasto(String Miasto){
        this.Miasto = Miasto;
    }

    public String getUlica(){
        return Ulica;
    }
    public void setUlica(String Ulica){
        this.Ulica = Ulica;
    }

    public String getNr_domu(){
        return Nr_domu;
    }
    public void setNr_domu(String Nr_domu){
        this.Nr_domu = Nr_domu;
    }

    public String getNr_lokalu(){
        return Nr_lokalu;
    }
    public void setNr_lokalu(String Nr_lokalu){
        this.Nr_lokalu = Nr_lokalu;
    }

    public int getNr_poczty(){
        return Nr_poczty;
    }
    public void setNr_poczty(int Nr_poczty){
        this.Nr_poczty = Nr_poczty;
    }


    @Override
    public String toString() {
        return "Adresy [Nr_adresu=" + Nr_adresu + ", Miasto=" + Miasto + ", Ulica=" + Ulica + ", Nr_domu=" + Nr_domu + ", Nr_lokalu=" + Nr_lokalu + ", Nr_poczty=" + Nr_poczty + "]";
    }
}
