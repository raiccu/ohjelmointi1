package chapter5;
import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {
    static Random satunnaisgeneraattori = new Random();
    public static void main(String[] args) {
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);

        Scanner sc = new Scanner(System.in);

        System.out.println("Arvaa ajattelemani luku väliltä 0-99: ");
        int luku = sc.nextInt();
        while (luku != satunnaisluku){
            if (luku < satunnaisluku){
                System.out.println("Oikea luku on suurempi kuin " + luku + "!");
                System.out.println("Arvaa uudelleen: ");
                luku = sc.nextInt();
            } else if (luku > satunnaisluku){
                System.out.println("Oikea luku on pienempi kuin " + luku + "!");
                System.out.println("Arvaa uudelleen: ");
                luku = sc.nextInt();
            }
        }

        System.out.println("Oikein!");

        sc.close(); 
    }
}
