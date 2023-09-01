package chapter6;
import java.util.Scanner;


public class Arvaus {
    public static void main(String[] args) {
        int luku = 78;

        Scanner sc = new Scanner(System.in);

        int arvaustenMäärä = 1;

        System.out.println("Arvaa lukua väliltä 1-100: ");
        int arvaus = sc.nextInt();

        while (arvaus != luku){
            arvaustenMäärä += 1;

            if (arvaus > luku){
                System.out.println("Arvaa pienempää: ");
                arvaus = sc.nextInt();
            } else if (arvaus < luku){
                System.out.println("Arvaa suurempaa: ");
                arvaus = sc.nextInt();
            }
        }

        System.out.println("Arvasit oikein. Arvauksia oli " + arvaustenMäärä);

        sc.close();
    }
}
