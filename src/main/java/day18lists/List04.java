package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females= new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
        //names.containsAll(females "names"listindeki "females" listindeki "tüm elemanların" var olup olmadığını
        //kontrol eder.Tamamı varsa size "true" ,herhangi biri yoksa "false" verir.
        boolean r =names.containsAll(females);
        System.out.println(r);

        //names.subList(1,4) "names" listindeki indexi 1,2,3 olan elemanları bir List in içinde size verir
        //ikinci index olan 4 dahil değildir.
        List<String> subList=names.subList(1,4);
        System.out.println(subList);

        names.retainAll(females);//2 listteki ortakları verir
        System.out.println(names);
        System.out.println(females);
        // ex1: Elektronik aletler ve ev aletleri listleriniz var
        // elektronik ev aletlerini listeleyiniz

        List<String> electronics = new ArrayList<>();
        electronics.add("tv");
        electronics.add("radio");
        electronics.add("refrigerator");
        electronics.add("mobile phone");
        electronics.add("notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("carpet");
        homeGoods.add("fork");
        homeGoods.add("radio");
        homeGoods.add("chair");
        homeGoods.add("tv");
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);
        //homeGoods.retainAll(electronics) homesGoodsile electronics list lerinin ortak elemanlarını homeGoods listi
       // içinde verir.Başka bir deyişle (In other words) homeGoods listindeki ortak elemanları siler

        //isEmpty() Listte hiç eleman yoksa "true" , 1 veya daha fazla eleman varsa size false verir
        //isEmpty() esasında "names.size()==0" demektir


        names.hashCode();
        System.out.println(names.hashCode());










    }
}
