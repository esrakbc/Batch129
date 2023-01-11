package practise_nighttime;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız 'c' ve 'a' içeren bir String değer içerisindeki 'c' karakterinden önceki 'a'
        karakterlerinin sayısını bulan kod yazınız
         */
        //alacakaranlık==>2
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c ve 'a harflerini içeren bir ifade giriniz");
        String str = input.nextLine().toLowerCase();

        int sayac=0; //+==>0 *==>1 default değerler toplama ve çıkarma
        for (int i = 0; i< str.length() ; i++){
            if (str.charAt(i)=='a') {
                sayac++;
            }else if (str.charAt(i)=='c'){
                break;
            }//else if
        }//for loop
        System.out.println("c'den önceki a 'ların sayısı: "+ sayac);





    }
}
