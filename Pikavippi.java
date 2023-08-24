import java.util.Scanner;

public class Pikavippi {
    public static void main(String[] args){
        Scanner pikavipinMäärä = new Scanner(System.in);
        System.out.println("Anna pikavipin määrä euroissa: ");
        int määrä = pikavipinMäärä.nextInt();

        Scanner vuosienMäärä = new Scanner(System.in);
        System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
        int vuodet = vuosienMäärä.nextInt();

        Scanner lainanKorko = new Scanner(System.in);
        System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%): ");
        int korko = lainanKorko.nextInt();

        double lainanHinta = määrä * vuodet * korko / 100;

        System.out.println("Lainatut rahat maksavat eli korko " + lainanHinta);
        pikavipinMäärä.close();
        vuosienMäärä.close();
        lainanKorko.close();
    }
}
