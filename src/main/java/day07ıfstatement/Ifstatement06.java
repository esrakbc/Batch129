package day07ıfstatement;

import java.util.Scanner;

public class Ifstatement06 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int age  = input.nextInt();
        if (age<0) {
            System.out.println("Gecerli bir yas giriniz...");
        } else if (age<5) {
            System.out.println("Bebek");
        } else if (age< 13) {
            System.out.println("Cocuk");
        } else if (age< 21) {
            System.out.println("Genç");
        } else if (age<31) {
            System.out.println("Yetişkin");
        } else {
            System.out.println("Tanımlanmamış yas...");



    }
    }
}
