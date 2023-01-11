package day13whileloopdowhileloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //int a=12; bu yapının içinde sadece bir tane data depolanır
        //Ama biz code yazarken bir yapının içinde çoklu data depolama ihtiyacı hissederiz.
        //bir yapının içinde çoklu data depolayabilme için Java "array" yapısını oluşturmuştur
        //Array nasıl oluşturulur?
        String stdNames[]=new String[5];
        //Array console a nasıl yazdırılır
        //toString methodu kullanmadan sadece array ismi ile yazdırırsanız Java o array ın adresini yazdırır
        System.out.println(Arrays.toString(stdNames));//[null,null,null,null,null]
        //array e eleman ekleme nasıl olur?
        stdNames[2]= "Ajda";
        stdNames[0]="Cuneyt";
        stdNames[1]="Kemal";
        stdNames[3]="Ezel";
        stdNames[4]="Besir";
        System.out.println(Arrays.toString(stdNames));
        //Array dan specific bir elemanı almak
        System.out.println(stdNames[2]);
        //ex:Arraydaki her eleman sonuna "!" işareti koyarak ekrana yazdırın
        for (int i=0; i<stdNames.length;i++){
            System.out.println(stdNames[i] + "!");
        }


    }
}
