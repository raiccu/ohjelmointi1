package chapter4;
import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna nopeusrajoitus: ");
        int nopeusrajoitus = sc.nextInt();

        System.out.println("Anna nopeutesi: ");
        int nopeutesi = sc.nextInt();

        int ylinopeus = nopeutesi - nopeusrajoitus;

        if(nopeusrajoitus >= 10 && nopeusrajoitus <= 60){
            if(ylinopeus <= 15){
                System.out.println("Rikesakko on 170");
            } else if(ylinopeus > 15 && ylinopeus <= 20){
                System.out.println("Rikesakko on 200");
            } else if(ylinopeus > 20){
                System.out.println("Menee päiväsakoille");

            }
        } else if(nopeusrajoitus >= 70 && nopeusrajoitus <= 120){
            if(ylinopeus <=15){
                System.out.println("Rikesakko on 140");
            } else if(ylinopeus > 15 && ylinopeus <= 20){
                System.out.println("Rikesakko on 200");
            } else if(ylinopeus > 20){
                System.out.println("Menee päiväsakoille");
            }
        }

        sc.close();
    }
}
