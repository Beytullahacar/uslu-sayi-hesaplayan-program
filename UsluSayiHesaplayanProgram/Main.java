package UsluSayiHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,us,total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        taban = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        us = scan.nextInt();

        for (int i = 1; i<= us; i++){
            total *= taban;
        }
        System.out.println("Sonuç : " + total);
    }
}
