package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //ex1:String Array elemanlarını uzunluklarına göre küçükten büyüğe sıralayınız
        //["Michael", "Ajda" , "Thomas", "Tom"]==>["Tom","Ajda","Thomas","Michael"]
        String arr[] = {"Michael", "Ajda" , "Thomas", "Tom"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        //ex2:String elemanlarını karakter sayısına göre büyükten küçüğe göre sırala
        String brr[] = {"Michael", "Ajda" ,"Reyhane","Gabriel", "Thomas", "Tom","Ali","Cin","Cem","Cüneyt"};
        System.out.println(Arrays.toString(brr));
        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));
        //ex3:aynı karakter sayısında olanları da alfabetik sıraya koyunuz
        String crr[]= {"Michael", "Ajda" ,"Reyhane","Gabriel", "Thomas", "Tom","Ali","Cin","Cem","Cüneyt"};
        System.out.println(Arrays.toString(crr));
        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));





    }
}
