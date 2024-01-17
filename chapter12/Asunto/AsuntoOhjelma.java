package chapter12.Asunto;

import java.util.Scanner;

public class AsuntoOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna asunnon tyyppi:");
        String tyyppi = sc.nextLine();

        System.out.println("Anna osoite:");
        String osoite = sc.nextLine();

        System.out.println("Anna pinta-ala:");
        double pintaala = sc.nextDouble();

        System.out.println("Anna hinta:");
        double hinta = sc.nextDouble();
        sc.nextLine();

        System.out.println("Anna kuvaus:");
        String kuvaus = sc.nextLine();

        Asunto asunto1 = new Asunto(tyyppi, osoite, pintaala, hinta, kuvaus);
        System.out.println(asunto1.toString());

        sc.close();
    }
}
