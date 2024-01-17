package koe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenJarjestys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Syötä kymmenen kokonaislukua: ");
        List<Integer> luvut = new ArrayList <Integer>();
        for(int i = 0; i < 10; i++){
            int luku = sc.nextInt();
            luvut.add(luku);
        }
        int jarjestys = 0;
        for(int i = 0; i < luvut.size() - 1; i++){
            if(luvut.get(i)<luvut.get(i+1)){
                jarjestys = 1;
            } else if(luvut.get(i)>luvut.get(i+1)){
                jarjestys = 2;
            } else {
                jarjestys = 0;
            }
        }

        if(jarjestys == 1){
            System.out.println("Luvut ovat kasvavassa järjestyksessä.");
        } else if(jarjestys == 2){
            System.out.println("Luvut ovat laskevassa järjestyksessä.");
        } else if (jarjestys == 0) {
            System.out.println("Luvut ovat epäjärjestyksessä. ");
        }

        sc.close();
    }
}
