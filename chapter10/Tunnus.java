package chapter10;
import java.util.Scanner;

public class Tunnus {

    static Scanner sc = new Scanner(System.in);

    static String teeTunnus(String etu, String suku){
        System.out.println("Anna sukunimi: ");
        suku = sc.next();

        System.out.println("Anna etunimi: ");
        etu = sc.next();

        suku = suku.toLowerCase().substring(0, 3);
        etu = etu.toLowerCase().substring(0, 3);

        return suku + etu;
    }
    public static void main(String[] args) {
        System.out.println("Tunnus on " + teeTunnus(null, null));
    }
}
