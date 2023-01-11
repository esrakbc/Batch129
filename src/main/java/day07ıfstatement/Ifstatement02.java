package day07ıfstatement;

import java.util.Scanner;

public class Ifstatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int num = input.nextInt();

        //1.yol
        if (num%2 ==0){
            System.out.println("Cift sayı...");
        }
        if (num%2!=0){
            System.out.println("Tek sayı...");
        }
        //2.yol
        if (num%2 ==0) {
            System.out.println("Cift Sayı...");
        }else {
            System.out.println("Tek sayı...");
        }
    }
}
