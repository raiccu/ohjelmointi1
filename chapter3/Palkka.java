package chapter3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna palkka: ");
        int palkka = sc.nextInt();

        System.out.println("Anna veroprosentti: ");
        int veroprosentti = sc.nextInt();

        System.out.println("Anna ikä: ");
        int ikä = sc.nextInt();

        double tyel;

        if (ikä >= 53 && ikä <= 62 ){
            tyel = 8.25 / 100;
        } else {
            tyel = 6.75 / 100;
        }

        System.out.println("Bruttopalkka " + palkka);
        System.out.println("Veron osuus " + df.format((double)(palkka*veroprosentti/100)));
        System.out.println("Työeläkevakuutusmaksun osuus " + df.format(palkka * tyel));
        System.out.println("Työttömyysvakuutuksen osuus " + df.format(palkka * 0.015));
        System.out.println("Käteen jää " + df.format(palkka - (palkka*veroprosentti/100) - (palkka*tyel) - (palkka*0.015)));
        sc.close();
    }
}
