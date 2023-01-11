package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        aşağıda gorduğunuz şekli console a yazdıran kodu oluşturunuz
        1)x x x x x
        2)x x x x x
        3)x x x x x
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir(row) sayısını giriniz ");
        int row = input.nextInt();
        System.out.println("Sutun (column) sayısını giriniz...");
        int colomn = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= colomn; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}