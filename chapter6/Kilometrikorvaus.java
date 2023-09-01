package chapter6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int tulos = 0;

        System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
        int kilometrit = sc.nextInt();

        while (kilometrit != 0){
            tulos += kilometrit;
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            kilometrit = sc.nextInt();
        }

        System.out.println("Yhteensä " + tulos + " kilometriä");
        double korvaus = tulos * 0.46;

        System.out.println("Korvaus on " + df.format(korvaus) + " euroa");

        sc.close();
    }
}
