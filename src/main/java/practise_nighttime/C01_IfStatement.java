package practise_nighttime;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen  gun ismini giriniz...");
        String gun = input.next().toLowerCase(); // kucuk harfe çevirdik
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else
            System.out.println("Kutsal gun degil");

        }

    }

