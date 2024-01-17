package koe;

import java.util.Scanner;

public class KestoSekunteina {

    private static int kestoSekunteina(int tunnit, int minuutit, int sekunnit){
        int sekunnitYht = (tunnit * 60 * 60) + (minuutit * 60) + sekunnit;

        return sekunnitYht;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna tunnit: ");
        int tunnit = sc.nextInt();
        System.out.println("Anna minuutit: ");
        int minuutit = sc.nextInt();
        System.out.println("Anna sekunnit: ");
        int sekunnit = sc.nextInt();

        System.out.println("Yhteensä " + kestoSekunteina(tunnit, minuutit, sekunnit) + " sekuntia.");

        sc.close();
    }
}
