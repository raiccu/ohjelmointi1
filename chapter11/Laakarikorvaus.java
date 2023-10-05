package chapter11;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Laakarikorvaus {

    static Scanner sc = new Scanner(System.in);

    static double laskeKorvaus(int kesto){

        double korvaus = 0;

        if(kesto <= 10){
            korvaus = 8.00;
        }
        if(kesto >= 10 && kesto <= 20){
            korvaus = 11.00;
        }
        if(kesto >= 20 && kesto <= 30){
            korvaus = 13.50;
        }

        return korvaus;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna käynnin kesto: ");
        int kesto = sc.nextInt();

        System.out.println("Kestoltaan " + kesto + " minuutin yleislääkärikäynnistä kelakorvaus on " +  df.format(laskeKorvaus(kesto)) + " euroa");
    }
}
