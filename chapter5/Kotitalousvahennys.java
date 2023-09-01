package chapter5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double työkorvaus = 0;
        double tulos = 0;

        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");

        while((työkorvaus = sc.nextDouble()) != 0){
            tulos += työkorvaus;
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        }

        double vahennys = tulos / 2 - 100;

        if(vahennys > 2400){
            vahennys = 2400;
        }

        if (vahennys < 0){
            vahennys = 0;
        }

        System.out.println("Kotitalousvähennyksen määrä on " + df.format(vahennys) + " euroa");

        sc.close();
    }
}
