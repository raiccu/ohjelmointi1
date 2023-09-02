package chapter7;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Salasana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String salasana = "";
        boolean salasanaValidity = false;

        System.out.println("Anna salasana: ");
        salasana = sc.next();

        if (salasana.length() > 8 && Pattern.compile("[a-z]").matcher(salasana).find() && Pattern.compile("[A-Z]").matcher(salasana).find() && Pattern.compile("[0-9]").matcher(salasana).find()) {
            salasanaValidity = true;

        } else {
            salasanaValidity = false;
        }

        if (salasanaValidity == true) {
            System.out.println("Salasana kelpaa.");
        } else if (salasanaValidity == false) {
            System.out.println("Salasana ei käy.");
        }

        sc.close();
    }
}
