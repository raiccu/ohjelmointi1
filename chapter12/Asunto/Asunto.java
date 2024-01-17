package chapter12.Asunto;

import java.text.DecimalFormat;

public class Asunto {
    
    private String tyyppi;
    private String osoite;
    private Double pintaAla;
    private Double hinta;
    private String kuvaus;

    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public String getOsoite() {
        return osoite;
    }
    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }
    public Double getPintaAla() {
        return pintaAla;
    }
    public void setPintaAla(Double pintaAla) {
        this.pintaAla = pintaAla;
    }
    public Double getHinta() {
        return hinta;
    }
    public void setHinta(Double hinta) {
        this.hinta = hinta;
    }
    public String getKuvaus() {
        return kuvaus;
    }
    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }


    /**
     * @param asunto
     */

    public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus){
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }

    public Asunto(){
        this.tyyppi = "";
        this.osoite = "";
        this.pintaAla = 0.0;
        this.hinta = 0.0;
        this.kuvaus = "";
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        
        String str = "Tyyppi: " + this.tyyppi + "\n" +
        "Osoite: " + this.osoite + "\n" +
        "Pinta-ala: " + df.format(this.pintaAla) + "\n" +
        "Hinta: " + df.format(this.hinta) + "euroa\n" +
        "Kuvaus:" + this.kuvaus;
        return str;
    }
}

