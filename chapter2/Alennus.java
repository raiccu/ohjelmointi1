package chapter2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna alentamaton hinta: ");
        double normaaliHinta = lukija.nextDouble();

        System.out.println("Anna alennusprosentti: ");
        double alennusProsentti = lukija.nextDouble();

        double alennettuHinta = normaaliHinta * (100.0 - alennusProsentti) / 100;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Alennettu hinta on " + decimalFormat.format(alennettuHinta));

        lukija.close();
    }
}
