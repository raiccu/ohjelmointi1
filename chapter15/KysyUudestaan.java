package chapter15;

import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0; // Initialize to a default value

        while (true) {
            try {
                System.out.print("Syötä kokonaisluku: ");
                number = Integer.parseInt(sc.nextLine());
                break; // Exit the loop when a valid integer is entered
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen luku!");
            }
        }

        System.out.println("Syötit luvun " + number + ".");
        sc.close();
    }
}

