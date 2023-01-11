package practise_nighttime;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class C05Interwiew {
    public static void main(String[] args) {
        /*
        Interwiew sorusu
        Kullancıdan bir String alınız
        String de var olan her karakterin sayısını ekrana yazdırın
        Ör/ alacan ==> a= 3 ,l=1 ,c=1, n=1
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = input.nextLine(); // alican
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int counter =0;
        for (int i =1; i< arr.length ; i++){ // index değil 1
            if (arr[i-1].equals(arr[i])) {
                counter++;// aynı olanlar için 1 arttır
            }else {
                System.out.println(arr[i-1]+ " karakterinin sayısı "+ (counter+1) + " kez tekrarlanmıştır");
                counter =0; // başka harfe geçtiği için sıfırlanmalı
            }
            if (i==arr.length-1)
                System.out.println(arr[i] + " karakterinin sayısı " + (counter+1) + " kez tekrarlanmıştır ");
            }


        }
    }

