package chapter1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Alv {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna 1. tuotteen hinta: ");

        double tuote1 = lukija.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Tuotteen 1 ALV on " + decimalFormat.format(tuote1 * 14 / 114) + " euroa.");

        System.out.println("Anna 2. tuotteen hinta: ");

        double tuote2 = lukija.nextDouble();

        System.out.println("Tuotteen 2 ALV on " + decimalFormat.format(tuote2 * 14 / 114) + " euroa.");

        System.out.println("Anna 3. tuotteen hinta: ");

        double tuote3 = lukija.nextDouble();

        System.out.println("Tuotteen 3 ALV on " + decimalFormat.format(tuote3 * 14 / 114) + " euroa.");

        lukija.close();
    }
}
