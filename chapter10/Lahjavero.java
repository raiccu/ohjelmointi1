package chapter10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {

    static double laskeVero(double arvo, double b, double c, double d){
        return (((arvo - b) / 100) * c) + d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna lahjan suuruus: ");
        double arvo = sc.nextDouble();

        double alaraja  = 0;
        double veroprosentti = 0;
        double alinArvo = 0;

        if(arvo >= 5000 && arvo <= 25000){
            alaraja = 5000;
            veroprosentti = 8;
            alinArvo = 100;
        }

        if (arvo >= 25000 && arvo <= 55000){
            alaraja = 25000;
            veroprosentti = 10;
            alinArvo = 1700;
        }

        if(arvo >= 55000 && arvo <= 200000){
            alaraja = 55000;
            veroprosentti = 12;
            alinArvo = 4700;
        }

        if(arvo >= 200000 && arvo <= 1000000){
            alaraja = 200000;
            veroprosentti = 15;
            alinArvo = 22100;
        }

        if (arvo >= 1000000){
            alaraja = 1000000;
            veroprosentti = 17;
            alinArvo = 142100;
        }

        double veronMaara = laskeVero(arvo, alaraja, veroprosentti, alinArvo);

        System.out.println("Lahjavero on " + df.format(veronMaara) + " euroa");

        sc.close();
    }
}
