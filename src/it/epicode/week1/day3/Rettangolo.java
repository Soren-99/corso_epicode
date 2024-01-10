package it.epicode.week1.day3;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea(){
        return altezza * larghezza;
    }

    public double calcolaPerimetro(){
        return 2 * (altezza + larghezza);
    }

    public  void stampaRettangolo(){
        System.out.println("Area:" + calcolaArea());
        System.out.println("Perimetro"+ calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Rettangolo1:");
        rettangolo1.stampaRettangolo();
        System.out.println();

        System.out.println("Rettangolo2:");
        rettangolo2.stampaRettangolo();
        System.out.println();

        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle aree " + sommaAree);
        System.out.println("Somma dei perimetri " + sommaPerimetri);
    }

    public static void main(String[] args){
        Rettangolo rettangolo1 = new Rettangolo(6, 12);
        Rettangolo rettangolo2 = new Rettangolo(9,3);

        stampaDueRettangoli(rettangolo1, rettangolo2);

    }

}
