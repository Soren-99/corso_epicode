package it.epicode.week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esericizio2 {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            randomList.add((int) (Math.random() * 101));
        }
        Collections.sort(randomList);
        return randomList;
    }

    public static List<Integer> concatenateAndReverse(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>(inputList);
        Collections.reverse(result);
        inputList.addAll(result);
        return inputList;
    }

    public static void printListByPosition(List<Integer> inputList, boolean printEven) {
        for (int i = 0; i < inputList.size(); i++) {
            if (printEven && i % 2 == 0) {
                System.out.println("Position " + i + ": " + inputList.get(i));
            }else if (!printEven && i % 2 != 0) {
                System.out.println("Position " + i + ": " + inputList.get(i));
            }
        }
    }

}

