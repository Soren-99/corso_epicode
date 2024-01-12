package it.epicode.week1.progettom1s1;



interface Riproducibile {
    int getDurata();
    void play();
}

abstract class ElementoMultimediale {
    protected String titolo;
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    abstract void esegui();
}

class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    protected int durata;
    protected int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public int getDurata(){
        return durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    void esegui(){
        play();
    }
}

class Video extends RegistrazioneAudio {
    private int luminosita;
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void diminuisciLuminosita(){
        if (luminosita >0){
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i=0; i < getDurata(); i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    void esegui() {
        play();
    }
}

class Immagine extends ElementoMultimediale {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    @Override
    void esegui(){
        show();
    }

}








