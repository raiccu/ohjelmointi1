package chapter5;
import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna lukukausien määrä: ");
        int lukukaudet = sc.nextInt();

        int tulos = 0;

        for (int i = 1; i <= lukukaudet; i++) {
            System.out.println("Anna " + i +  ". lukukauden opintopisteesi: ");
            int opintopisteet = sc.nextInt();
            tulos += opintopisteet;
        }

        int tavoite = lukukaudet * 30;

        System.out.println("Sinulla pitäisi olla tähän mennessä " + tavoite + " opintopistettä.");
        System.out.println("Sinulla on " + tulos + " opintopistettä.");

        if (tulos > tavoite){
            System.out.println("Olet edellä tavoitteesta.");
        } else if(tulos < tavoite){
            System.out.println("Olet jäljessä tavoitteesta.");
        } else if(tulos == tavoite){
            System.out.println("Olet tavoitteessa.");
        }

        int tutkinto = 210;

        System.out.println("Tutkinnosta puuttuu vielä " + (tutkinto - tulos) + " opintopistettä.");

        sc.close();
    }
}
