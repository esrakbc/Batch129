package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bes basamaklı bir sayı giriniz");
      int number = input.nextInt();
      int lastDigit = number%10 ;
      number = number/10;
      int lastSecondDigit = number%10 ;
       number = number/10;
       int lastThirdDigit = number%10;
       number = number/10;
       int lastFourthDigit  = number%10;
       number = number/10;
       int lastFifthDigit = number%10;
       number = number/10;
        System.out.println(lastDigit + lastSecondDigit +lastFourthDigit+lastFifthDigit);





    }
}
