package chapter4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ylevero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double vuositulot;
        int ikä;

        System.out.println("Anna vuositulosi ja ikäsi: ");
 
        vuositulot = sc.nextDouble();
        ikä = sc.nextInt();

        double ylevero = vuositulot * 0.68 / 100;

        if (ylevero > 140){
            ylevero = 140;
        } else if (ylevero < 70 ){
            ylevero = 0;
        }

        if (ikä < 18){
            ylevero = 0;
        }

        System.out.println("Ylevero on " + df.format(ylevero));

        sc.close();
    }
}

