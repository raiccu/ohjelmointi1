package chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanLuvut {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");
        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Täydennä koodia tehtävänannon mukaisesti

        for(int i = 0; i<luvut.size(); i++){
            int luku = luvut.get(i);
            System.out.println(luku);
        }
    }
}
