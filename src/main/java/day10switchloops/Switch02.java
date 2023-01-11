package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //example:Kullanıcıdan 2 sayı ve yapılacak islemi alan ve +,-,*,/,% islemlerini yapan kudu giriniz
        Scanner input= new Scanner(System.in);
        System.out.println(" İki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Yapılacak islemi giriniz. +,-,*,/,% dan birini seciniz");
        char opr = input.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println(a + "+" + b  +"=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b  +"=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b  +"=" + (a*b));
                break;
            case'/':
                System.out.println(a + "/" + b  +"=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b  +"=" + (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanımlanmamıstır");
        }














    }
}
