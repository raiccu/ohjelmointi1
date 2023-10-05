package chapter10;

import java.util.Scanner;

public class Kellonaika {

    static Scanner sc = new Scanner(System.in);

    static String kysyKellonaika(String aika){
        System.out.println("Anna kellonaika muodossa tt:mm: ");
        aika = sc.next();

        return aika;
    }

    static Boolean tarkastaKellonaika(String kellonaika){
        kellonaika = kysyKellonaika(null);

        if (kellonaika.matches("[0-2]" + "[0-4]" + ":" + "[0-5]" + "[0-9]")){
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        if (tarkastaKellonaika(null)){
            System.out.println("Kellonaika on oikein");
        } else {
            System.out.println("Kellonaika on väärin");
        }
    }
}
