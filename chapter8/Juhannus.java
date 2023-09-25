package chapter8;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Juhannus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä vuosi: ");
        int vuosi = sc.nextInt();

        LocalDate start = LocalDate.of(vuosi, Month.JUNE, 20);
        LocalDate end = LocalDate.of(vuosi, Month.JUNE, 26);

        DayOfWeek startDay = start.getDayOfWeek();
        DayOfWeek endDay = end.getDayOfWeek();

        DayOfWeek lauantai = DayOfWeek.SATURDAY;

        while(startDay != lauantai){
            
        }

        sc.close();
    }
}
