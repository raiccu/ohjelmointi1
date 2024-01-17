package chapter12.Remontti;

import java.time.LocalDate;
import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna vuosi: ");
        int vuosi = sc.nextInt();
        int nykyinenpaiva = LocalDate.now().getYear();

        sc.nextLine();

        Remontti remontti = new Remontti();

        String kuvaus = "";

        if(vuosi <= nykyinenpaiva){ //
             System.out.println("Anna kuvaus: ");
            kuvaus = sc.nextLine();
            remontti.setVuosi(vuosi);
            remontti.setKuvaus(kuvaus);
            System.out.println(remontti.toString());
        } else System.out.println("Vuosi ei voi olla tulevaisuudessa");

        sc.close();
    }
}
