package chapter5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int kilometrit = 0;
        int tulos = 0;

        System.out.println("Anna ajetut kilometrit (0 lopettaa): ");

        while((kilometrit = sc.nextInt()) != 0){
            tulos += kilometrit;
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
        }

        System.out.println("Yhteensä " + tulos + " kilometriä");
        System.out.println("Korvaus on " + df.format(tulos * 0.43) + " euroa");

        sc.close();
    }
}
