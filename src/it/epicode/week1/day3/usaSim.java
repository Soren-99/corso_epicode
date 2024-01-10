package it.epicode.week1.day3;

public class usaSim {

    public static void main(String[] args) {
        SIM miaSIM = new SIM("393892096", 0.1);

        miaSIM.stampaDatiSIM();

        boolean chiamataRiuscita = miaSIM.telefonata(60, "356472189");
        if (chiamataRiuscita) {
            System.out.println("Chiamata effettuta con successo!");
        } else {
            System.out.println("Credito insufficiente!");
        }

        miaSIM.setCreditoDisponibile(6);
        miaSIM.stampaDatiSIM();
    }
}

