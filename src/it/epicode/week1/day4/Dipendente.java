package it.epicode.week1.day4;

public class Dipendente {
    private static final double stipendioBase = 1000;

    private final int matricola;
    private double stipendio;

    private double importoOrarioStraordinario;
    private Livello livello;

    private Dipartimento dipartimento;

    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario,
                      Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;

    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
    }

    public Livello promouovi() {
        switch (livello) {
            case OPERAIO:
                livello = livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                livello = livello.QUADRO;
                break;
            case QUADRO:
                livello = livello.DIRIGENTE;
                break;
            case DIRIGENTE:
                System.out.println("Errore: il dipendente è già un dirigente.");
                break;
        }

        aggiornaStipendio();
        return livello;
    }

    private void aggiornaStipendio() {
        switch (livello) {
            case IMPIEGATO:
                stipendio = stipendioBase * 1.2;
                break;
            case QUADRO:
                stipendio = stipendioBase * 1.5;
                break;
            case DIRIGENTE:
                stipendio = stipendioBase * 2;
                break;
        }
    }


    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        return dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraordinario);

    }

}









