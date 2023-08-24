import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        Double leveys = lukija.nextDouble();
        Double pituus = lukija.nextDouble();
        Double korkeus = lukija.nextDouble();

        System.out.println("Anna huoneen leveys, pituus ja korkeus: " + leveys + " " + pituus + " " +  korkeus);
        
        Scanner litranmitta = new Scanner(System.in);

        int litra = litranmitta.nextInt();

        System.out.println("Paljonko litralla saadaan maalattua neliöitä: " + litra);

        Double laskutoimitus = ((leveys + leveys + pituus + pituus ) * korkeus / litra);

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(laskutoimitus);

        System.out.println("Maalin tarve on " + format + " litraa");
    }
}

