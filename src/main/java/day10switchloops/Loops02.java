package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {
        //exp 1: 21 den 180 ne kdr hem 4 hem de 6 ile bölünebilen tamsayıları ekrana yazdıran kodu yazdıırn
        for (int i = 21 ; i <181 ; i++){
            if (i%4==0 && i%6== 0){
                System.out.println(i+ " ");
            }
        }
        //exp2 :size verilen küçük harflerle yazılmış String in index i cift sayı olan karakterlerini büyük harf yapınız.
        // ankara== AnKaRa
        //yazdığınız kod belli senaryolar icin çalışıyor , tüm senaryolar icin çalışmıyorsa;bu code'a hard code denir
        // hard code yanlış yazılmış code dur,mutlaka düzeltilmelidir.
        //Note: Bir String de son index= length() -1
        String s = "ankara";
        String t = " ";
        for ( int i= 0 ; i<s.length() ; i++ ){
            String ch = s.substring(i, i+1);
            if(i%2==0){
                System.out.println( ch.toUpperCase());


            }

        }







    }
}
