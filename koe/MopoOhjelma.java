package koe;

import java.util.Scanner;

public class MopoOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kuinka monta vuotta vanha henkilö on: ");
        int ika = sc.nextInt();

        if(ika < 15){
            System.out.println("Ikä ei vielä riitä mopokorttiin.");
        } else {
            System.out.println("Henkilö voi saada mopokortin.");
        }

        sc.close();
    }
}
