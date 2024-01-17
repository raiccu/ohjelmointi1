package chapter15;

import java.util.Scanner;

public class ArvonTarkastus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä luku väliltä 0-23: ");
        int numero = sc.nextInt();

        if(numero >= 0 && numero <= 23){
            System.out.println("Numero " + numero + " on sallittu.");
        } else throw new IllegalArgumentException(null, null);


        sc.close();
    }
}
