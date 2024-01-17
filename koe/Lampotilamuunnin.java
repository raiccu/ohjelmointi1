package koe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lampotilamuunnin {

    static double muunnaFahrenheitiksi(double celsius){
        double fahrenheit = celsius * 9/5 + 32;

        return fahrenheit;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna lämpötila celsiuksena: ");
        double celsius = sc.nextDouble();

        double fahrenheit = muunnaFahrenheitiksi(celsius);

        System.out.println("Lämpötila Fahrenheitteina on: " + df.format(fahrenheit));

        sc.close();
    }
}
