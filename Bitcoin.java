import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna Bitcoineihin investoidun rahan määrä: ");

        int investointi = lukija.nextInt();
        double arvo = 15.06;
        double tuotto;

        tuotto = arvo * investointi - investointi;


        System.out.print("Bitcoin tuotti vuodessa " + tuotto);
        lukija.close();
    }
}