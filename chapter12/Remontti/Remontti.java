package chapter12.Remontti;

import java.time.LocalDate;

public class Remontti {
    private int vuosi;
    private String kuvaus;

    LocalDate nykyinenpaiva = LocalDate.now();

    public Remontti() {
        this.vuosi = 0;
        this.kuvaus = "";
    }

    public boolean getVuosi() {
        if(this.vuosi >= nykyinenpaiva.getYear()){
            return false;
        } else {
            return true;
        }
    }

    public void setVuosi(int vuosi) {
        if(getVuosi()){
            this.vuosi = vuosi;
        } else vuosi = 0;
    }

    public String getKuvaus() {
        return this.kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public LocalDate getNykyinenpaiva() {
        return this.nykyinenpaiva;
    }

    public void setNykyinenpaiva(LocalDate nykyinenpaiva) {
        this.nykyinenpaiva = nykyinenpaiva;
    }
    @Override

    public String toString() {
        String str = "";
        if(getVuosi()){
            str = "Vuonna " + vuosi + " tehtiin remontti " + kuvaus;
        } else str = "Vuosi ei voi olla tulevaisuudessa";

        return str;
    }
}
