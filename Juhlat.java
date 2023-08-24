import java.util.Scanner;
import java.lang.Math;

public class Juhlat {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna juhliin tulevien aikuisten määrä: ");

        int aikuiset = lukija.nextInt();
        int lasiaPerPullo = 7;
        int tarvittavatPullot = (int)Math.ceil((double)aikuiset / lasiaPerPullo);

        int ylimääräiset = (tarvittavatPullot * lasiaPerPullo) - aikuiset;
        

        System.out.println("Pulloja tarvitaan " + tarvittavatPullot + " kappaletta");

        System.out.println("Viimeisestä pullosta jää " + ylimääräiset + " lasia");
        lukija.close();
    }
}
