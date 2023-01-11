package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists02 {
    public static void main(String[] args) {
        //Arraylist oluştururken sağ tarafa (constructor) Arraylist yazmak zorundasınız
        //Ama sol tarafa ister "ArrayList"yazın ister de "List" yazın,ikisi de calışır.
        List<Character> initials =new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        //Bir List de kaç eleman olduğunu nasıl anlarız?
        int numOfElement=initials.size();
        System.out.println(numOfElement);
        //Note:Array larden bahsederken "Length"kullanın, List lerden bahseerken "Size"kullanın.
        //Bir List ten istenen bir eleman nasıl alınır?
        char u =initials.get(2);
        System.out.println(u);
        //Ex1: Verilen bir String List deki elemanların toplam karakter sayısını bulan kodu yazınız.
        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.yol(recommended)
        int sum=0;
        for (String w: cities){
           sum=sum+ w.length();
        }
        System.out.println(sum);
        //2.yol
        int toplam=0;
        for (int i =0; i< cities.size();i++ ){
            toplam=toplam +cities.get(i).length();
        }
        System.out.println(toplam);
        //Bir List deki istenen bir elemanı nasıl değiştirebiliriz?
        cities.set(0,"New York");
        System.out.println(cities);
        //ex2:Maaş List i oluşturunuz ve maaşlara %20 zam yapınız.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);
        //1.yol foreachloop
        int idx =0;
        for (Double w :salary){
           salary.set(idx,w*1.20) ;
           idx++;
        }
        System.out.println(salary);
        //2.yol
        for (int i=0;i<salary.size();i++){
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);


    }
}
