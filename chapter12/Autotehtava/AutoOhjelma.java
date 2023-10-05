package chapter12.Autotehtava;

public class AutoOhjelma {
    public static void main(String[] args) {
        Auto Tesla = new Auto("Tesla");
        Auto BMW = new Auto("BMW");

        Tesla.aja(100);
        BMW.aja(98);
        Tesla.aja(23);

        System.out.println(Tesla.toString());
        System.out.println(BMW.toString());
    }
}
