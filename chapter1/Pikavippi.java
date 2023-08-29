package chapter1;
import java.util.Scanner;

public class Pikavippi {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pikavipin määrä euroissa: ");
        int määrä = lukija.nextInt();

        System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
        int vuodet = lukija.nextInt();

        System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%): ");
        int korko = lukija.nextInt();

        double lainanHinta = määrä * vuodet * korko / 100;

        System.out.println("Lainatut rahat maksavat eli korko " + lainanHinta);
        lukija.close();
        
    }
}
