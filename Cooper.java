import java.util.Scanner;

public class Cooper {
    public static void main(String[] args) {
        Scanner cooper = new Scanner(System.in);
        System.out.println("Anna juostu matka: ");
        int matka = cooper.nextInt();

        int kierrokset = matka / 400;

        System.out.println("Kokonaisia 400 metrin kierroksia oli " + kierrokset);
        cooper.close();
    }
}
