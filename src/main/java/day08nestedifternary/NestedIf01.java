package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarları icin 3 tane uzunluk giriniz");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());
     if ((a+b >c && c>Math.abs(a-b) && ( a+c > b && b>Math.abs(a-c) ) && ( b+c > a && a>Math.abs(b-c)) )) {
      System.out.println("Sen ucgensin...");
      }else {
      System.out.println("Sen ucgen degilsin...");
      if (a==b && b==c && c==a) {
        System.out.println("Ucgen hem de eskenar ucgen...");
      }else {
        System.out.println("Ucgen ama eskenar ucgen degil...");
    }


}

    }
}
