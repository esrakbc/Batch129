package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //String array oluşturun içine 5 tane eleman ekleyin ,ilk eleman ile son elemannın
        //içerdiği karakter sayıları toplamı ekrana yazdırın.
        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));//[Math, Science,Music,English,Art]
        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7
        //ex2:
        //String array oluşturun içine 5 tane eleman ekleyin ,tüm elemanların
        //içerdiği karakter sayıları toplamı ekrana yazdırın.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";
        //1.yol;
        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);
        //2.yol:for-each-loop==>başlangıc değeri,loop un çalışma şartı ve increment/decrement kısmını kendisi halleder
        // for-each-loop "Array" ve "Collection"larda kullanılır
        //Index kullanmanız gerektiğinde bazen"for-each-loop" çaresiz kalır, mecburen diğer loop'ları kullanırız.

        int sum=0;
        for (String w :brr){
            sum=sum +w.length();
        }
        System.out.println(sum);

    }
}
