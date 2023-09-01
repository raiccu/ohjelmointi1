package chapter6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kassakone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna ostoksen hinta (0 lopettaa): ");
        double hinta = 0;
        double tulos = 0;

        while((hinta = sc.nextDouble()) != 0){
            System.out.println("Anna ostoksen hinta (0 lopettaa): ");
            tulos += hinta;
        }

        System.out.println("Ostosten verollinen hinta on " + df.format(tulos));

        double alv = tulos * 24.0 / 124.0;

        System.out.println("ALV:n osuus on " + df.format(alv));

        double veroton = tulos - alv;

        System.out.println("Veroton hinta on " + df.format(veroton));

        sc.close();
    }
}
