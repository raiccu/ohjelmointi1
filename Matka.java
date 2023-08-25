import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna matka: ");
        int matka = lukija.nextInt();

        System.out.println("Anna nopeus: ");
        int nopeus = lukija.nextInt();

        double aika = (double)matka / nopeus;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Aikaa menee " + decimalFormat.format(aika) + "tuntia");
                
        lukija.close();
    }
}
