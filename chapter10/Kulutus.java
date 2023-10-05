package chapter10;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kulutus {

    static Scanner sc = new Scanner(System.in);

    static int kysyKilometrit(int kysyKm){
        System.out.println("Anna ajetut kilometrit: ");
        kysyKm = sc.nextInt();

        return kysyKm;
    }

    static double kysyTankkaus(double kysyTank){
        System.out.println("Anna tankattu määrä: ");
        kysyTank = sc.nextDouble();

        return kysyTank;
    }

    static double laskeKulutus(int kilometrit, double tankattu){
        kilometrit = kysyKilometrit(0);
        tankattu = kysyTankkaus(0);

        return (tankattu / kilometrit) * 100; 
    }

    static void naytaKulutus(double kulutus){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Kulutus/100km on " + df.format(laskeKulutus(0, 0)) + " litraa");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        naytaKulutus(0);
        sc.close();
    }
}
