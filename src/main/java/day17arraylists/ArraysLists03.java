package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists03 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);
        //Remove metodu index ile kullanılırsa o indexteki elemanı siler
        //Remove metodu index ile kullanılırsa size sildiği elemanı verir
        String n =cities.remove(1);
        System.out.println(n);
        System.out.println(cities);
        //Remove metodu eleman ile kullanılırsa ilk görünümü siler
        //Remove metodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden
        //true veya false verir
        // eğer eleman List te varsa o elemanı siler true verir
        //eğer eleman List te yoksa o elemanı silemediğinden size false der
        boolean p =cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);

    }
}
