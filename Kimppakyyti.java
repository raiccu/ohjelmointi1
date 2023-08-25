import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ajetut kilometrit: ");
        int ajetutKilometrit = lukija.nextInt();
        
        System.out.println("Anna kulutus per 100 km: ");
        double kulutusPer100km = lukija.nextDouble();

        System.out.println("Anna polttoaineen litrahinta: ");
        double litrahinta = lukija.nextDouble();

        System.out.println("Anna kimppakyytiläisten lukumäärä: ");
        int kyytiläiset = lukija.nextInt();

        double kustannusPerHlö = (double)(ajetutKilometrit * kulutusPer100km / 100.0 * litrahinta / kyytiläiset);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Bensakustannus per henkilö on " + df.format(kustannusPerHlö) + " euroa");

        lukija.close();
    }
}
