package it.epicode.week2.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi (N): ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleSet = new HashSet<>();

        Set<String> duplicateSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            if (!paroleSet.add(parola)) {
                duplicateSet.add(parola);
    }
}

System.out.println("Parole duplicate:");

for (String duplicate : duplicateSet) {
    System.out.println(duplicate);
}

System.out.println("Numero di parole distinte: " + paroleSet.size());

System.out.println("Elenco delle Parole Distinte: ");
for (String parolaDistinta : paroleSet) {
    System.out.println(parolaDistinta);
}
}
}



