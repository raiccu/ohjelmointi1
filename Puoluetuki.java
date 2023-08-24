import java.util.Scanner;

public class Puoluetuki {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna kansanedustajien lukumäärä: ");

        int kelkm;
        kelkm = lukija.nextInt();
        int puoluetukieurot;
        puoluetukieurot = 148175;

        int puoluetukiLkm = kelkm * puoluetukieurot;

        System.out.println("Puoluetuen määrä on " + puoluetukiLkm + " euroa");

        lukija.close();
    }
} 
