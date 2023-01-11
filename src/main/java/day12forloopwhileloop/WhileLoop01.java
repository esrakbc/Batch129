package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //ex:3 ten 10 na kdr tamsayıları console a yazdırın
        //1.yol:for-loop
        for (int i = 3; i<11;i++){
            System.out.print(i+" ");
        }
        //2.yol:while--loop
        int i=3;
        while (i<11){
            System.out.print (i + " ");
            i++;
        }
        //ex:23 den 12 ye kdr cift tamsayıları console a yazınız
        int k = 23;
        while (k>12){
            if (k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }
        //ex3: verilen bir tamsayının rakamları toplamını console a yazdıran kodu yazdırın//interwier
        // sayı%10 her zaman sayının son rakamını verir
        //1.yol
        int num= 57864;
        int sum = 0;
        while (num>0){
           sum= sum + num%10;

            num/=10;
        }
        System.out.println(sum);
        //2.yol : for-loop
        int a=684;
        int toplam=0;
        for (int m =a ; m>0 ;  m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);
    }
}
