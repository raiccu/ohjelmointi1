package chapter12.Kirja;
import java.text.DecimalFormat;

public class Kirja {

    private String nimi;
    private String isbn;
    private double hinta;
    private int vuosi;

    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getHinta() {
        return hinta;
    }
    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
    public int getVuosi() {
        return vuosi;
    }
    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }
    

    /**
        @param kirja
    */
    public Kirja(String nimi, String isbn, double hinta, int vuosi){
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.vuosi = vuosi;
    } 

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");

        return "Kirja [nimi=" + this.nimi + ", isbn=" + this.isbn + ", hinta=" + this.hinta + ", vuosi=" + this.vuosi + "]";
    }

    

}
