package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraysLists01 {
    public static void main(String[] args) {
        /*
       1) Arraylistsler(list) çoklu data depolamak için kullanılır
        2)ArrayListsler(list) non primitive data typle indeki çoklu dataları depolamak için kullanılır
        *List ler "non primitive" data kabul ederler, "array" lar "primitive data" veya "reference" kabul edeer
        3)ArrayListsleri(list) oluştururken içine koyacağınız eleman sayısını başta söylemeye gerek yoktur.
        *List ler eleman sayısında "flexible"dırlar ama "array"lar "flexible"değildirler
        4)Madem "array" ar eleman sayısında "flexible "değil niçin java" array" ları iptal etmedi?
        i)Eleman sayısı belli olan dataları depolamak için array lar tercih edilir.
        ii)Array lar çok hızlı çalışır.
        iii) Array lar memory de ço az yer kaplar.
         */
        //List nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);
        //List lere eleman nasıl eklenir?
        //List e eleman eklemek için add() metodu kullanırız
        //Add() metodu elemanları sizin verdiğiniz sırada List'e ekler.(Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(5,888);
        System.out.println(ages);
        //Lİst 'e çoklu eleman nasıl eklenir?veya Lİst'e başka bir List nasıl eklenir?
        //Bir List'e çoklu eleman eklemek için o elemanları önce bir List in içine koymalsınız
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);
        //Bir Lİst deki tüm elemanları nasıl silebilirim?.clear() metodu ile
        //Contains() metodu bir elemanın olup olmadığını kontrol eder.
        //Bir List in başka bir List ile aynı olup olmadığını nasıl kontrol ederiz?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
       boolean s =names1.equals(names2);
        System.out.println(s);
        //2 List in eşit olabilmesi için aynı index te aynı elemanlar olmalıdır
        //ex1: verilen integer 2 list te tamamıyla aynı eleman olup olmadığını kontrol eden kodu yazınız
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1);
        Collections.sort(nums2);
        nums1.equals(nums2);
        boolean t =nums1.equals(nums2);
        System.out.println(t);



    }
}
