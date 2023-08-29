package chapter4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Matkavertailu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Montako matkaa teet kuukaudessa: ");
        int matkat = sc.nextInt();
        System.out.println("Anna yksittäisen lipun hinta: ");
        double yksiHinta = sc.nextDouble();
        System.out.println("Anna kuukausilipun hinta: ");
        double kuukausiHinta = sc.nextDouble();



        if(matkat * yksiHinta < kuukausiHinta) {
            System.out.println("Yksittäinen on " + df.format(kuukausiHinta - (matkat * yksiHinta)) + " euroa halvempi kuin kuukausilippu");
        } else if(matkat * yksiHinta > kuukausiHinta){
            System.out.println("Kuukausilippu on " + df.format(matkat * yksiHinta - kuukausiHinta) + " euroa halvempi kuin yksittäinen");
        }

        sc.close();
    }
}
