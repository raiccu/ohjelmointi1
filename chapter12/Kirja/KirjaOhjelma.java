package chapter12.Kirja;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna nimi: ");
        String nimi = sc.nextLine();

        System.out.println("Anna isbn: ");
        String isbn = sc.nextLine();

        System.out.println("Anna hinta: ");
        double hinta = sc.nextDouble();

        System.out.println("Anna julkaisuvuosi: ");
        int vuosi = sc.nextInt();

        Kirja kirja1 = new Kirja(nimi, isbn, hinta, vuosi);
        System.out.println("\n" + kirja1.toString());

        Kirja kirja2 = new Kirja(isbn, isbn, hinta, vuosi);

        kirja2.setNimi(nimi);
        kirja2.setIsbn(isbn);
        kirja2.setHinta(hinta);
        kirja2.setVuosi(vuosi);

        System.out.println("\nNimi: " + kirja2.getNimi());
        System.out.println("\nIsbn: " + kirja2.getIsbn());
        System.out.println("\nHinta: " + df.format(kirja2.getHinta()));
        System.out.println("\nJulkaisuvuosi: " + kirja2.getVuosi());

        sc.close();
    }
}
