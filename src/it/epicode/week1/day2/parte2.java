package it.epicode.week1.day2;

import java.security.SecureRandom;
import java.util.Scanner;

public class parte2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        System.out.println(stampaNumero(test));
        scan.close();
    }

    public static String stampaNumero(int num) {
        String result;
        switch (num) {
            case 0: {
                result = "zero";
                break;
            }
            case 1: {
                result = "uno";
                break;
            }
            case 2: {
                result = "due";
                break;
            }
            case 3: {
                result = "tre";
                break;
            }
            default:
                result= "error";
        }
        return result;
    }
}
