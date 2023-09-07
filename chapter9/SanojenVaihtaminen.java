package chapter9;

import java.util.Arrays;
import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kirjoita lause: ");
        String lause = sc.nextLine();
        String[] sanat = lause.split(" ");

        System.out.println("Mitkä sanat vaihdetaan keskenään?");
        String numerot = sc.nextLine();
        String[] numerot2 = numerot.split(" ");

        int eka = Integer.parseInt(numerot2[0]);
        int toka = Integer.parseInt(numerot2[1]);

        String[] lause2 = Arrays.copyOf(sanat, sanat.length);
        lause2[eka] = sanat[toka];
        lause2[toka] = sanat[eka];

        String format = Arrays.toString(lause2)
        .replace(",", "")
        .replace("]", "")
        .replace("[", "");

        System.out.println(format);

        sc.close();
    }
}
