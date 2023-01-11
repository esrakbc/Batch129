package practise_nighttime;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n  toplama yapmak icin 1 \n cikarma yapmak icin 2 " +
                "\n carpma yapmak icin 3 \n bolme yapmak icin 4 giriniz");
        int  islem = input.nextInt();
        System.out.println("Lutfen iki tamsayı giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if (islem==1) {
            System.out.println("Toplama isleminin sonucu: " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem==2) {
            System.out.println("Cıkarma  isleminin sonucu: " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem==3) {
            System.out.println("Carpma  isleminin sonucu: " + num1 + "*" + num2 + "=" + (num1 * num2));
        } else if (islem==4) {
            System.out.println("Bolme isleminin sonucu: " + num1 + "/" + num2 + "=" + (num1 / num2));
        }else
            System.out.println("Hatalı secim yaptınız tekrar deneyiniz");
        }

    }



