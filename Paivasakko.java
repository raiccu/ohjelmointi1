import java.util.Scanner;

public class Paivasakko {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna nettotulot: ");
        int nettotulo = lukija.nextInt();

        int paivasakko = (nettotulo - 255) / 60;

        System.out.println("Nettotuloilla " + nettotulo + "päiväsakko on " + paivasakko + "euroa");

        lukija.close();
    }
}
