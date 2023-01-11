package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //ex:kullacının verdiği sayı için çarpım tablosun oluşturup console a yazdıran kodu yazınız
        // 3==>3x1=3 3x2=6 3x3=9 3x4=12...3x=30
        Scanner input= new Scanner(System.in);
        System.out.println("Carpım tablosunu görmek icin bir sayı giriniz");
        double num=input.nextDouble();

        int i =1;
        while (i<11){
            System.out.println(num + "x"+ i + "="+ (num*i));
            i++;
        }
        //verilen bir string de her harfin sonrasına "*" sembolü ekleyiniz
        // java ==>J*a*v*a*
        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord= " ";
        int k = 0;
        while (k<word.length()){
            newWord = newWord+ word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);

    }




}
