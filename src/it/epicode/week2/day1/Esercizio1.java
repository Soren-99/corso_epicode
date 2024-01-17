package it.epicode.week2.day1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array Iniziale:");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            try {
                System.out.print("Inserisci un numero (0 per terminare):");
                numero = scanner.nextInt();

                if (numero != 0) {
                    System.out.println("Inserisci la posizione (da 1 a 5):");
                    int posizione = scanner.nextInt();

                    if (posizione >= 1 && posizione <= 5) {
                        array[posizione - 1] = numero;
                        stampaArray(array);
                    } else {
                        System.out.println("Errore: la posizione deve essere compresa tra 1 e 5.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Errore: Inserire un numero valido.");
                scanner.nextLine();
            }
        } while (numero != 0);
        System.out.println("Programma Terminato");
    }

    private static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.println(value + "");
        }
        System.out.println();
    }
}