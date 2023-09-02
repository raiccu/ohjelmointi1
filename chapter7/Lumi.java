package chapter7;
import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nimi = "";

        int kpl = 0;
        int lumiCounter = 0;


        while (true){
            System.out.println("Anna nimi: ");
            nimi = sc.next();
            kpl++;

            if(nimi.equalsIgnoreCase("lumi")){
                lumiCounter++;
            }
            if (nimi.equalsIgnoreCase("loppu")){
                kpl--;
                System.out.println("Nimiä oli " + kpl + " kappaletta.");
                System.out.println("Nimi Lumi esiintyi " + lumiCounter + " kertaa.");
                break;
            }
        }

        

        sc.close();
    }
}
