package it.epicode.week2.day2;

import java.util.List;

public class UsaEs2 {
    public static void main(String[] args) {
        int N = 5;

        List<Integer> randomList = Esericizio2.generateRandomList(N);
        System.out.println("Generated Random List: " + randomList);

        List<Integer> concatenatedAndReversed = Esericizio2.concatenateAndReverse(randomList);
        System.out.println("Concatenated and Reversed List: " + concatenatedAndReversed);

        System.out.println("Printing even positions: ");
        Esericizio2.printListByPosition(concatenatedAndReversed, true);

        System.out.println("Printing odd positions: ");
        Esericizio2.printListByPosition(concatenatedAndReversed, false);
    }
}