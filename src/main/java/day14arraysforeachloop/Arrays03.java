package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ex1:String bir array oluşturun,6 tane eleman yerleştiriniz,karakter sayısı 5 den cok olan elemanları siliniz
        String colors[]= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));
        //yeni bir array oluşturup karakter sayısı 5 ve 5 ten küçük olam
        //elemanları yeni array a transfer edeceğiz.Böylelikle yeni array de karakter
        //sayısı 5 den büyük olan hiçbir eleman olmayacak
        //Array oluşturmak için 2 şey belirlenmelidir
        //1) elemanlarun data type ı
        //2) yeni array da kaç tane eleman olacak
        //verilen array da eleman sayısı 5 ve 5 den küçük olan kaç eleman var bulmalıyız
        int counter = 0;
        for (String w : colors){
            if (w.length()<=5){
                counter++;
            }
        }
        System.out.println(counter);
        //yeni array oluştur
        String newColors[] = new String[counter];
        // Karakter sayısı 5 ve 5 den kuçuk olanları yeni array e transfer et
        int idx =0;
        for (String w :colors){
            if (w.length()<=5){
                newColors[idx] =w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newColors));
        //ınterwiew sorusuydu


    }
}
