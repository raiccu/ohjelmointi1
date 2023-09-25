package chapter4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Puhelinlasku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna rahasumma puhelinlaskulle 1");
        String lasku1 = sc.nextLine();

        System.out.println("Anna rahasumma puhelinlaskulle 2");
        String lasku2 = sc.nextLine();

        Double luku1 = Double.valueOf(lasku1);
        Double luku2 = Double.valueOf(lasku2);
        double summa = luku1 + luku2;

        System.out.println("Haluttu yhteissumma lukuna on " + df.format(summa) + " euroa");

        sc.close();
    }
}
