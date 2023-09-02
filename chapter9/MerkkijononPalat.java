package chapter9;
import java.util.Arrays;
import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kirjoita lause: ");
        String lause = sc.nextLine();

        String[] lauseArray = lause.split(" ");

        String lauseFormat = Arrays.toString(lauseArray);
        
        String lauseTulos = lauseFormat.toString().replace(",", "\n")
        	    .replace("[", "")
        	    .replace("]", "")
        	    .replace(" ", "");

                System.out.println(lauseTulos);
        sc.close();
    }
}
