import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna huoneen leveys, pituus ja korkeus: ");

        Double leveys = lukija.nextDouble();
        Double pituus = lukija.nextDouble();
        Double korkeus = lukija.nextDouble();
        
        Scanner litranmitta = new Scanner(System.in);

        System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");

        int litra = litranmitta.nextInt();

        Double laskutoimitus = ((leveys + leveys + pituus + pituus ) * korkeus / litra);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Maalin tarve on " + decimalFormat.format(laskutoimitus) + " litraa");
    }
}

