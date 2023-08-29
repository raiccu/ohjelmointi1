package chapter3;
import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Onko 1=katsastus, 2=jälkitarkastus: ");

        int tyyppi = sc.nextInt();

        int hinta = 0;

        if (tyyppi == 1){
            System.out.println("Mitataanko päästöt 0=ei, 1=kyllä: ");
            int mittaus = sc.nextInt();

            if (mittaus == 1){
                System.out.println("Onko auto 0=bensa, 1=diesel: ");
                int auto = sc.nextInt();

                if (auto == 0){
                    hinta = (hinta + 22);
                }
                if (auto == 1){
                    hinta = (hinta + 31);
                }
            }
        }

        if (tyyppi == 1){
            hinta = (hinta + 50);
        }

        if (tyyppi == 2){
            hinta = (hinta + 30);
        }

        System.out.println("Hinta on " + hinta);

        sc.close();
    }
}
