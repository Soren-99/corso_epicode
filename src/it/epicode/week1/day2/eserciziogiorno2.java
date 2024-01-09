package it.epicode.week1.day2;

public class eserciziogiorno2 {

    public static void main(String[] args) {
    }

    public static boolean stringEvenOdd(String str) {
        return str.length() % 2 == 0 ? true : false;
    }

    public static boolean annoBisestile(int anno){
        if (anno % 400 == 0 ) {
            return true;
        } else return anno % 4 == 0 && anno % 100 != 0;
    }
}
