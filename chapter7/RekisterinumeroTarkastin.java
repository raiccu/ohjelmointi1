package chapter7;
import java.util.Scanner;
import java.util.regex.*;

public class RekisterinumeroTarkastin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
            String rekisterinumero = sc.nextLine().trim();
        
            if(rekisterinumero.equalsIgnoreCase("q")){
                break;
            }
        
        String malli = "^[a-zA-ZåäöÅÄÖ]{2,3}-\\d{1,3}$";

        Pattern pt = Pattern.compile(malli);

        Matcher ma = pt.matcher(rekisterinumero);
            
         if (ma.matches()) {
            System.out.println(rekisterinumero + " on kelvollinen rekisterinumero.");
        } else {
            System.out.println(rekisterinumero + " ei ole kelvollinen rekisterinumero.");       
            }
        }
       sc.close();
    }
}

