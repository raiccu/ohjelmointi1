package chapter12.Kirja;

public class KirjaOhjelma {
    public static void main(String[] args) {
        Kirja kirja1 = new Kirja("97 Things Every Java Programmer Should Know", "ei tietoa", 26.80, 2020);

        System.out.println(kirja1);

        Kirja kirja2 = new Kirja();
    }
}
