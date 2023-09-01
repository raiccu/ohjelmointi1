package chapter5;
import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä jokin positiivinen kokonaisluku: ");
        int luku = sc.nextInt();

        if (luku <= 1){
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }


        boolean alkuluku = true;

        for (int i = 2; i <= Math.sqrt(luku); i++){
            if(luku % i == 0){
                alkuluku = false;
                break;
            } 
        }

        if(alkuluku == false){
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }
        if (alkuluku == true){
            System.out.println("Luku " + luku + " on alkuluku.");
        }
        
        sc.close();
    }
}
