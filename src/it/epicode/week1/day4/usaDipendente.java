package it.epicode.week1.day4;

public class usaDipendente {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1, Dipendente.Dipartimento.PRODUZIONE);

        System.out.println("Dati del dipendente 1:");
        dipendente1.stampaDatiDipendente();

        dipendente1.setImportoOrarioStraordinario(40);
        dipendente1.setDipartimento(Dipendente.Dipartimento.AMMINISTRAZIONE);

        System.out.println("\nDati aggiornati del Dipendente 1:");
        dipendente1.stampaDatiDipendente();

        Dipendente dipendente2 = new Dipendente(2, 1200, 25, Dipendente.Livello.QUADRO, Dipendente.Dipartimento.VENDITE );

        System.out.println("\nDati del Dipendente 2:");
        dipendente2.stampaDatiDipendente();

        System.out.println("\nPromozione del Dipendente 2:");
        Dipendente.Livello nuovoLivello = dipendente2.promouovi();
        System.out.println("Nuovo Livello: " + nuovoLivello);

        int oreStraordinario = 10;
        double pagaDipendente1 = Dipendente.calcolaPaga(dipendente1, oreStraordinario);
        System.out.println("\nPaga mensile del Dipendente 1 con straordinario: " + pagaDipendente1);

    }
}
