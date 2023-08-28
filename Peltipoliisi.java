import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Anna nopeutesi: ");
        int nopeus = sc.nextInt();

        if (nopeus > 80 && nopeus <= 100){
            System.out.println("Rikesakko");
        } else if (nopeus > 100){
            System.out.println("Päiväsakko");
            System.out.println("Anna nettokuukausitulosi: ");
            double nettotulot = sc.nextDouble();
            double sakko = (nettotulot - 255) / 60;

                if (sakko > 6){
                    System.out.println("Päiväsakon määrä on " + df.format(sakko) + " euroa");
                }
                if (sakko <= 6){
                    System.out.println("Päiväsakon määrä on 6,00 euroa");
                }            

        } else {
            System.out.println("Ei sakkoja");
        }

        sc.close();
    }
}
