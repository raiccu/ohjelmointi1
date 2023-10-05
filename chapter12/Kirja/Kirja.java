package chapter12.Kirja;

public class Kirja {

    private String nimi;
    private String isbn;
    private double hinta;
    private int julkaisuvuosi;

    public void set(){
        nimi = this.nimi;
        isbn = this.isbn;
        hinta = this.hinta;
        julkaisuvuosi = this.julkaisuvuosi;
    }

    public void get(){

    }

    /**
        @param kirja
    */
    public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi){
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.julkaisuvuosi = julkaisuvuosi;
    } 

    @Override
    public String toString(){

        return "Kirja [nimi=" + this.nimi + ", isbn=" + this.isbn + ", hinta=" + this.hinta + ", vuosi=" + this.julkaisuvuosi + "]";
    }

    

}
