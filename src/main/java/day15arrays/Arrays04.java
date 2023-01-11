package day15arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //ex4:Bir arrayın içinde herhangi bir elemanın olup olmadığını
        //kontrol eden ve kaç kere tekrarlandığını gösteren kodu yazınız
        int a[]= {0,2,3,0,12,0};
        int num=3;
        int counter = 0;
        for (int w :a ){
            if (w==num){
                counter++;

            }
        }
        if (counter >0) {
            System.out.println(num + " array'de " + counter + " defa var");
        }else {
            System.out.println(num +" array de yok");
        }
    }
}
