package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Multidomensional array oluşturunuz ve bir dimensionalli arraya dönüştürünüz
        //[[2,5],[3],[4,7,11]]==>[2,5,3,47,11]
        int a[][] ={{2,5},{3},{4,7,11}};
        System.out.println(Arrays.deepToString(a));
        //a arrayindeki toplam eleman sayısını bulunuz
        int totalElement = 0;
        for (int[] w : a){
            totalElement= totalElement + w.length;
        }
        // b isimli tek dimensionalli bir array oluşturunuz
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));
        //a arrayındeki elemanları b arrayine transfer ediniz
        int idx = 0;

        for (int[] w :a){
            for (int k : w){
                b[idx] =k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(b));

    }
}
