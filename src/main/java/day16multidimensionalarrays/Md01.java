package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //multidimensional array nasıl olusturulur?
        int a[][]=new int[3][2];

        //Multidimensional array ler nasıl yazdırılır?
        System.out.println(Arrays.deepToString(a));
        //Multidimensional array lere eleman nasıl eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));
        //note:Array lara nonprimitive data konulamaz.
        String b[]= {"tom","hanks","tom hanks"};
        //Arraylere non primitive data konulamaz
        //Array lere primitive data veya reference konulur
        //Ama siz bir array i yazdırmak istediğinizde Java adres ler yardımı ile non primitve dataya ulaşır
        //ve o non primitive data yı sanki array ın içindeymiş gibi gösterir.
        //Multidimensional array deki belli elemanlara nasıl ulaşılır?
        System.out.println(Arrays.toString(a[2]));
        System.out.println(a[1][0]);

        System.out.println(a[2][1]);
















    }
}
