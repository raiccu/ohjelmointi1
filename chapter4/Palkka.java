package chapter4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna palkka: ");
        int palkka = sc.nextInt();
        System.out.println("Anna veroprosentti: ");
        double veroprosentti = sc.nextDouble();
        System.out.println("Anna ikä: ");
        int ikä = sc.nextInt();

        System.out.println("Bruttopalkka " + palkka);
        System.out.println("Veron osuus " + df.format(palkka * veroprosentti / 100));

        double tyel = 5.55 / 100;

        if (ikä >= 53){
            tyel = 7.05 / 100;
        }

        double netto = palkka - (palkka * veroprosentti / 100) - (palkka * tyel) - (palkka * 0.0115);

        System.out.println("Työeläkevakuutusmaksun osuus " + df.format(palkka * tyel));
        System.out.println("Työttömyysvakuutuksen osuus " + df.format(palkka * 0.0115));

        System.out.println("Käteen jää " + df.format(netto));

        sc.close();
    }
}
