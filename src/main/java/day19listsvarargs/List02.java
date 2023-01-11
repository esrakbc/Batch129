package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) {
        /*
        Rastgele kullanıcı adı oluşturan JAVA kodu yazınız
        1.Kullanıcıdan ismini isteyelim
        2.Kullanıcı adındaki baştaki ve sondaki boşlukları silelim
        3.Kullanıcı adının alınabilir olup olmadığına bakalım
        4.Eğer bizim listemizde öyle bir kullancı yoksa kullanncı adı , kullanıcının girdiği isim olsun
        5.Eğer kullancı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelin ve gösterelim

         */
        List<String> databaseIsım = new ArrayList();
        databaseIsım.add("AYŞE");
        databaseIsım.add("AHMET");
        databaseIsım.add("SERDAR");
        databaseIsım.add("OKAN");
        databaseIsım.add("BETÜL");
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kullanıcı adı giriniz..");
        String userName = input.nextLine().toUpperCase().trim();
        if (databaseIsım.contains(userName)) {
            System.out.println("Bu username database de var, tekrar kullanılmaz");
            databaseIsım.add(userName +(int) (Math.random() * 100));
        }else {
            System.out.println("Bu username kullanılabilir..");
            databaseIsım.add(userName);

        }
    }
}
