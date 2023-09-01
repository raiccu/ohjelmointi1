package chapter6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
        double työkorvaus = sc.nextDouble();
        
        double tulos = 0;

        while (työkorvaus != 0){
            tulos += työkorvaus;
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            työkorvaus = sc.nextDouble();
        }

        double vähennys = tulos * 40 / 100 - 100;

        if (vähennys >= 2250){
            vähennys = 2250;
        }

        if (vähennys <= 0){
            vähennys = 0;
        }

        System.out.println("Kotitalousvähennyksen määrä on " + df.format(vähennys) + " euroa");        

        sc.close();
    }
}
