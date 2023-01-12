package com.bdbt_project.ClientAPP;

public class Bilety {
    private int Nr_biletu;
    private String Rodzaj_biletu;
    private String Czas_skasowania;
    private String Koniec_waznosci;
    private String Czy_ulgowy;
    private int Cena;
    private int Nr_zarzadu;
    private int Nr_klienta;


    public  Bilety() {

    }
    public Bilety(String Rodzaj_biletu, String Czas_skasowania, String Koniec_waznosci, String Czy_ulgowy, int Cena, int Nr_zarzadu, int Nr_klienta) {
        super();
        this.Rodzaj_biletu = Rodzaj_biletu;
        this.Czas_skasowania = Czas_skasowania;
        this.Koniec_waznosci = Koniec_waznosci;
        this.Czy_ulgowy = Czy_ulgowy;
        this.Cena = Cena;
        this.Nr_zarzadu = Nr_zarzadu;
        this.Nr_klienta = Nr_klienta;
    }

    public int getNr_biletu(){
        return Nr_biletu;
    }
    public void setNr_biletu(int Nr_biletu){
        this.Nr_biletu = Nr_biletu;
    }

    public String getRodzaj_biletu(){
        return Rodzaj_biletu;
    }
    public void setRodzaj_biletu(String Rodzaj_biletu){
        this.Rodzaj_biletu = Rodzaj_biletu;
    }

    public String getCzas_skasowania(){
        return Czas_skasowania;
    }
    public void setCzas_skasowania(String Czas_skasowania){
        this.Czas_skasowania = Czas_skasowania;
    }

    public String getKoniec_waznosci(){
        return Koniec_waznosci;
    }
    public void setKoniec_waznosci(String Koniec_waznosci){
        this.Koniec_waznosci = Koniec_waznosci;
    }

    public String getCzy_ulgowy(){
        return Czy_ulgowy;
    }
    public void setCzy_ulgowy(String Czy_ulgowy){
        this.Czy_ulgowy = Czy_ulgowy;
    }

    public int getCena(){
        return Cena;
    }
    public void setCena(int Cena_klienta){
        this.Cena = Cena;
    }

    public int getNr_zarzadu(){
        return Nr_zarzadu;
    }
    public void setNr_zarzadu(int Nr_zarzadu){
        this.Nr_zarzadu = Nr_zarzadu;
    }
    public int Nr_klienta(){
        return Nr_klienta;
    }
    public void setNr_klienta(int Nr_klienta){
        this.Nr_klienta = Nr_klienta;
    }

    @Override
    public String toString() {
        return "Bilety [Nr_biletu=" + Nr_biletu + ", Rodzaj_biletu=" + Rodzaj_biletu + ", Czas_skasowania=" + Czas_skasowania + ", Koniec_waznosci=" + Koniec_waznosci + ", Czy_ulgowy=" + Czy_ulgowy + ", Cena=" + Cena + ", Nr_zarzadu=" + Nr_zarzadu + ", Nr_klienta=" + Nr_klienta + "]";
    }
}
