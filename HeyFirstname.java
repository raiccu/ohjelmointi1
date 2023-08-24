import java.util.Scanner;

public class HeyFirstname {

    public static void main(String[] args) {
        Scanner lukija = new Scanner (System.in);
        System.out.print("Syötä etunimi: ");
        String etunimi = lukija.next();

        System.out.print("Hei " + etunimi + "!");
        lukija.close();
    }
}