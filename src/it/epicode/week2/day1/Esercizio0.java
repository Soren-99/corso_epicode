package it.epicode.week2.day1;

public class Esercizio0 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = addNumbers(a, b);
        System.out.println("Il risultato è: " + result);
    }

    private static int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
