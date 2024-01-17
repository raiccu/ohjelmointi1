package koe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HakuListalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sanat = new ArrayList<String>();
        String sana = "";
        for(int i = 1; i <= 5; i++){
            System.out.println("Kirjoita sana " + i + "/5: ");
            sana = sc.nextLine();
            sanat.add(sana);
        }

        System.out.println("Anna etsittävä termi: ");
        String haku = sc.nextLine();

        
        List<String> haut = new ArrayList<String>();


        for(int k = 0; k < sanat.size(); k++){
            if(sanat.get(k).contains(haku)){
            haut.add(sanat.get(k));
            }
        }
        

        System.out.println("löytyi " + haut.size() + " osumaa: \n" + haut.toString().replace("[", " ").replace("]", " ").replace(",", "\n"));
        
    }
}
