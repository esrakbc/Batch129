package practise_nighttime;

import java.util.Scanner;

public class C03_IncrementDecremenet {
    public static void main(String[] args) {
        System.out.println("Yuz"+40+60);
        System.out.println("Yuz"+(40+60));//parantez önceliği vardır
        System.out.println("ikiyuzkirk"+40*6);//islem öceliği vardır
        System.out.println(60+40+"Yuz");
        //kullanıcıdan ismini soyismini alınız.Kullanıcı nasıl girerse
        //tam isminin buyuk harfle yazılmasını sağlayın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızı giriniz");
        String isim = input.nextLine(), soyisim = input.nextLine();//multiple declaration
        String tamIsim = isim.concat(" "+soyisim).toUpperCase();
        System.out.println("Tam isim="+ tamIsim);
        //rakam haricindekileri silin
        String str = "$45..99";
        str= str.replaceAll("\\D","");
        System.out.println("str =" +str);
        //verilen cümleyi * ile gizleyip ,10.karakterden sonrasını yazdırın
        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+ cumle.substring(10));
        //a harifini @ işareti ile değiştirin
        String ders = "olaganüstü";
        System.out.println(ders.replace('a', '@'));
        //Verilen bir Stringde kullanılan noktalama isareti ve rakamlar ve space karakteri haric
        //tüm karakterlerin sayısını bulan kodu yazınız
        String str3 = "Learn Java earn 90000000 money,!...";
        int sonuc = str3.replaceAll("[0-9]"," ").
                replaceAll(" ","").
                replaceAll("\\p{Puncht}","").
                length();
        System.out.println("sonuc" + sonuc);


    }
}
