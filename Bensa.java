import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna tankattu määrä: ");
        double tankattuMäärä = lukija.nextDouble();

        System.out.println("Anna ajetut kilometrit: ");
        int ajetutKilometrit = lukija.nextInt();

        System.out.println("Anna litrahinta: ");
        double litrahinta = lukija.nextDouble();

        double ajonHinta = tankattuMäärä / ajetutKilometrit * litrahinta;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Ajo per kilometri maksaa " + decimalFormat.format(ajonHinta));

        lukija.close();
    }
}
