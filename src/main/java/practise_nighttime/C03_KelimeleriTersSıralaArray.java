package practise_nighttime;

import java.util.Arrays;

public class C03_KelimeleriTersSıralaArray {
    /* INTERWİEW SORUSU
    her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
    sözcükler değişmeden , her gidiş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız
    çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır
    Örnek: Kemal Can Kuzu ,Kuzu Can Kemal e dönüşecektir
     */
    public static void main(String[] args) {
        String str= "   Kemal Can Kuzu   ";// EN SONDAKİ KELİMEYİ AL//SPLİT METODU//KELİME OLRK PARÇ.İÇİN BOŞLUKTAN AL
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String tersStr = "";
        for (int i= arr.length-1;  i>=0; i--){
            tersStr+=arr[i]+" ";

        }
        System.out.print("trim başta işe yaradı mı");
        System.out.print(tersStr);
        System.out.println("trim sonda işe yaradı mı");
        System.out.print("trim başta işe yaradı mı");
        System.out.print(tersStr.trim());
        System.out.print("trim sonda işe yaradı mı");

    }
}
