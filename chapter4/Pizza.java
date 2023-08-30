package chapter4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna pizzojen hinnat (3): ");
        double pizza1 = sc.nextDouble();
        double pizza2 = sc.nextDouble();
        double pizza3 = sc.nextDouble();

        double halvin;

        if(pizza1 < pizza2 && pizza1 < pizza3){
            halvin = pizza1;
        } else if(pizza2 < pizza1 && pizza2 < pizza3){
            halvin = pizza2;
        } else {
            halvin = pizza3;
        }


        double summa = pizza1 + pizza2 + pizza3 - halvin;

        System.out.println("Maksettavaa: " + df.format(summa));

        System.out.println("Yksittäisen hinta: " + df.format(summa / 3));

        sc.close();
    }
}
