package it.epicode.week1.day3;

import java.util.ArrayList;
import java.util.List;

class SIM {
    private String numeroTelefono;
    private double costoPerSecondo;
    private double creditoDisponibile;

    private List<String> ultimeChiamate;

    public SIM(String numeroTelefono, double costoPerSecondo) {
        this.numeroTelefono = numeroTelefono;
        this.costoPerSecondo = costoPerSecondo;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new ArrayList<>();

    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Costo per secondo: " + costoPerSecondo);
        System.out.println("Credito disponibile: " + creditoDisponibile + "euro");
        System.out.println("Ultime chiamate effettuate: ");
        for (String chiamata : ultimeChiamate) {
            System.out.println(chiamata);
        }

    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCostoPerSecondo() {
        return costoPerSecondo;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public boolean telefonata(int secondi, String numeroChiamato) {
        double costoChiamata = secondi * costoPerSecondo;
        if (creditoDisponibile >= costoChiamata) {
            creditoDisponibile -= costoChiamata;
            String nuovaChiamata = "Durata: " + secondi + " secondi, Numero chiamato: " + numeroChiamato;
            aggiungiChiamata(nuovaChiamata);
            return true;
        } else {
            return false;
        }
    }


    private void aggiungiChiamata(String chiamata) {
        if (ultimeChiamate.size() >= 5) {
            ultimeChiamate.remove(0);
        }
        ultimeChiamate.add(chiamata);


    }
}



