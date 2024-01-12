package it.epicode.week1.progettom1s1;

import java.util.Scanner;
public class UsaLettoreMultimediale {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] playlist = new ElementoMultimediale[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1=Audio, 2=Video, 3=Immagine): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            if (tipo == 1){
                System.out.println("inserisci la durata: ");
                int durata = scanner.nextInt();
                System.out.println("Inserisci il volume: ");
                int volume = scanner.nextInt();
                playlist[i] = new RegistrazioneAudio(titolo, durata, volume);
            }else if (tipo == 2) {
                System.out.println("Inserisci la durata: ");
                int durata = scanner.nextInt();
                System.out.println("Inserisci il volume: ");
                int volume = scanner.nextInt();
                System.out.println("Inserisci la luminosità: ");
                int luminosita = scanner.nextInt();
                playlist[i] = new Video(titolo, durata, volume, luminosita);
            }else if (tipo == 3) {
                System.out.println("Inserisci la luminosita: ");
                int luminosita = scanner.nextInt();
                playlist[i] = new Immagine(titolo, luminosita);
            }
        }

        int scelta;
        do {
            System.out.println("Inserisci il numero dell'elemento da eseguire (1-5), 0 per uscire: ");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <=5) {
                playlist[scelta -1].esegui();
            }else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);

        scanner.close();

    }


}
