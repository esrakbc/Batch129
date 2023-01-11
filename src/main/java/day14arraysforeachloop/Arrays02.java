package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Integer arrays oluşturunuz,içine 6 tane eleman yerleştiriniz,bu elemanların en büyüğü ile en küçüğünün
        //toplamını ekrana yazdırınız
     int ages[] = new int[6];
     ages[0] =20;
     ages[1] =23;
     ages[2] =19;
     ages[3] =44;
     ages[4] =15;
     ages[5] =32;
        System.out.println(Arrays.toString(ages));//[20,23,19,44,15,32}==>sırala=>15 19 20 23 32 44
        //1.yol
    //    Arrays.sort(ages);// sort() metodu array deki elemanları küçükten büyüğe dizer
       // System.out.println(Arrays.toString(ages));
       // System.out.println(ages[0] +ages[ages.length-1]);
        //2.yol:
        int minimum  = ages[0];
        for (int w :ages){
          minimum =Math.min(minimum,w);
        }
        System.out.println(minimum);



    }
}
