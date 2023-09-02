package chapter8;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
        String paivamaara = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate laskunPvm = LocalDate.parse(paivamaara, dtf);

        LocalDate eraPaiva = laskunPvm.plusDays(14);

        System.out.println("Eräpäivä on " + eraPaiva.format(dtf));

        sc.close();
    }
}
