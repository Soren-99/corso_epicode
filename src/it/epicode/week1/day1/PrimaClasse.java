package it.epicode.week1.day1;

public class PrimaClasse {

    public static void main(String[] args){
        System.out.println(perimeter(8, 10.5));
        System.out.println(evenOdd(6));
        System.out.println(area(2.1, 3.9, 5.2));

    }

public static double perimeter(double l1, double l2) {
        return l1 + l2 + l1 + l2;
}

public static int evenOdd(int input) {
        return input % 2 == 0 ? 0 : 1;
}

public static double area(double l1, double l2, double l3) {
        double semiPerimeter = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter -l1) * (semiPerimeter -l2) * (semiPerimeter-l3));
}
}

//progetto mese 1 week 1 giorno 1

