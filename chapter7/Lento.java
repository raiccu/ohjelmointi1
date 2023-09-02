package chapter7;
import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lento;

        System.out.println("Anna lennon numero: ");
        lento = sc.next();

        if(lento.charAt(0)== 'A' && lento.charAt(1)== 'Y'){
            if(lento.charAt(2)== '1'){
                System.out.print("Kaukolento");
            }
            if(lento.charAt(2) >= '2' && lento.charAt(2) <= '6'){
                System.out.print("Kotimaan lento");
            }
            if(lento.charAt(2) == '7'){
                System.out.print("Venäjän lento");
            }
        } else {
            System.out.print("Ei ole Finnairin lento");
        }

        sc.close();
    }
}
