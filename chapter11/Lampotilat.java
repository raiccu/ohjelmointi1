package chapter11;
import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

    int kysyLampotilat(int[] lampotilat, final int MAX){
        Scanner sc = new Scanner(System.in);
        int lkm = 0;

        while (lkm < MAX) {
            System.out.print("Anna lämpötila: ");
            int temp = sc.nextInt();

            if (temp == -999) {
                break;
            }

            lampotilat[lkm] = temp;
            lkm++;
        }
        sc.close();
        return lkm;     
    }

    void naytaLampotilat(int[] lampotilat, int lkm){
        // Sort the array from lowest to highest
        Arrays.sort(lampotilat, 0, lkm);

        // Display the sorted temperatures
        System.out.println("Annoit lämpötilat:");
        for (int i = 0; i < lkm; i++) {
            System.out.println(lampotilat[i]);
        }
    }
    public static void main(String[] args) {
        Lampotilat lampotilat2 = new Lampotilat();
        int[] lampotilat = new int[100]; // Initialize an array to store temperatures

        int lkm = lampotilat2.kysyLampotilat(lampotilat, 100);
        lampotilat2.naytaLampotilat(lampotilat, lkm);

    }
}
