package chapter7;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int tuotenumero;
        String nimi = "";
        double hinta;
        String kuvaus;
            
        System.out.println("Anna tuotenumero: ");
        tuotenumero = sc.nextInt();

        System.out.println("Anna tuotteen nimi: ");
        nimi = sc.next();

        System.out.println("Anna tuotteen hinta: ");
        hinta = sc.nextDouble();

        System.out.println("Anna tuotteen kuvaus: ");
        kuvaus = sc.next();

        System.out.println("Numero: " + tuotenumero);
        System.out.println("Nimi: " + nimi.trim().toUpperCase());
        System.out.println("Hinta: " + df.format(hinta));
        System.out.println("Kuvaus: " + kuvaus.trim());

        sc.close();
    }
}
