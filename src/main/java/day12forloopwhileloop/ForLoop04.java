package day12forloopwhileloop;

import java.util.Scanner;
import java.util.SortedMap;

public class ForLoop04 {
    public static void main(String[] args) {
        /*
          Kullancıdan başlangıc ve bitis degerlerini alın.
          başlangıc değerinden başlayıp bitiş değerine kdr aradaki tüm cift sayıları ekrana yazdırın
          //10 12 14
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıc değerlerini giriniz...");
        int start = input.nextInt();
        System.out.println("Bitiş değerini giriniz...");
        int end = input.nextInt();
        if (start > end) {
            System.out.println("Başlangıc değeri bitiş değerinden küçük olamaz...");
        } else {

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }


        }
    }
}