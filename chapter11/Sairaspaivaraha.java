package chapter11;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sairaspaivaraha {

    static Scanner sc = new Scanner(System.in);

    static double vuositulosi(){
        System.out.println("Anna vuositulosi: ");
        double vuositulot = sc.nextDouble();
        return vuositulot;
    }

    static double laskeSairaspvaraha(double vuositulot){
        double sairaspaivaraha;

        if (vuositulot <= 1399) {
            sairaspaivaraha = 0;
        } else if (vuositulot <= 36419) {
            sairaspaivaraha = (0.7 * vuositulot) / 300;
        } else if (vuositulot <= 56032) {
            sairaspaivaraha = 84.98 + 0.4 * (vuositulot - 36419) / 300;
        } else {
            sairaspaivaraha = 111.13 + 0.25 * (vuositulot - 56032) / 300.0;
        }

        return sairaspaivaraha;
    }

    static void naytaSairaspvaraha(){
        DecimalFormat df = new DecimalFormat("0.00");
        double vuositulot = vuositulosi();
        double sairaspaivaraha = laskeSairaspvaraha(vuositulot);
        System.out.println("Vuosituloilla " + df.format(vuositulot) + " sairaspäiväraha on " + df.format(sairaspaivaraha) + " euroa/päivä.");
    }
    public static void main(String[] args) {

        naytaSairaspvaraha();
        sc.close();
    }
}
