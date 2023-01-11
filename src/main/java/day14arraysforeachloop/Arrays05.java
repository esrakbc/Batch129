package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //Note:sort() metodu sayısal data type larını küçükten büyüğe sıralar(ascendin order)
        //Note2:sort() metodu String data type larında alfabetik sıralar(alphabetic order)
        //Note3: ascending order+ alphabetical order==> Natural Order
        //Note4: sort() metodu array elemanlarını "Natural Order" a göre sıralar.

        //binarySearch()metodu bir elemanın bir array da olup olmadığını kontrol eder.
        //binary search() metodunu kullanmadan öönce "sort()" metodunu kullanmak zprundayız
        //sort() kullanmazsanız sonuç güvenilir olmaz
        String colors[]= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        int num1 = Arrays.binarySearch(colors,"Blue");
        System.out.println(num1);
        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2);
        int num3 = Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3);//-6==> "-" demek bu eleman yok demek
                                 // "6" ise olsaydı 6.eleman olurdu demek
    }
}
