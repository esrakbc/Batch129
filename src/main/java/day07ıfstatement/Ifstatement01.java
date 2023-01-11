package day07ıfstatement;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf....");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk Harf....");
        }

    }
}
