package chapter15;

import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;

        while(true){
            try {
                System.out.println("Syötä seuraava luku (0 lopettaa): ");
                int numero = Integer.parseInt(sc.nextLine());
                summa += numero;
                if(numero == 0){
                    System.out.println("Lukujen summa on " + summa + ".");
                    break;
                }

            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("Virheellinen syöte!");
            }
            
        }

        sc.close();
    }
}
