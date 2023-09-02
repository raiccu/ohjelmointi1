package chapter6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Luottolaskuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna luotollisen ostoksen hinta: ");
        double hinta = sc.nextDouble();

        System.out.println("Anna kuukausierien lukumäärä: ");
        int erät = sc.nextInt();

        for (int i = 1; i <= erät; i++) {
            System.out.println(i + ". erä " + df.format(hinta/erät) +" euroa, luottoa jäljellä " + df.format(hinta - (i * hinta/erät)) + " euroa");
        }

        sc.close();
    }
}
