package z1;

public class Main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potęgowania: " + a.power(5, 3));
        System.out.println("Wynik silni: " + a.silnia(4));
        System.out.println("Suma geoSequence: " + a.geoSequence(2,2,4));
        System.out.println("Suma altSequence: " + a.altSequence(2,2,4));
        System.out.println("Cy doskonała: " + a.perfectNumber(11));
        System.out.println("Cy doskonała: " + a.perfectNumber(28));

    }
}
