package day06stringmanipulationsifstatement;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s = " Ali Can ";
        System.out.println(s);
       String sTrimed = s.trim();
        System.out.println(sTrimed);
        String tv1 = "$456.99";
        String laptop1 = "$875.99";
        String tv2 = tv1.replace("$","");
        System.out.println(tv2);
        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);
        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);
        String name = "   ali cAN";
       char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
       char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println(""+ first + second);
        String str = "";
        boolean result = str.length()==0;
        System.out.println(" String bos mu ?" +result);
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? " + result2);
        String t = "     ";
       boolean result3 =  t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var ? " + result3);
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var ? " + result4);
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var ? "+ result5);
        String r = " Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);
        int idxI = r.indexOf('i');
        System.out.println(idxI);
        int idxE = r.indexOf('e');
        System.out.println(idxE);
        System.out.println("Index'ler toplamı : " + (idxA + idxI + idxE));
        String u = "Ah Java vah Java sensiz olmuyor Java";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);
        String v = " Java is easy to learn";
        int idxOfA =v.lastIndexOf('a');
        System.out.println(idxOfA);
        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);
        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);
        System.out.println(idxOfA + idxOfI + idxOfE);
        int num= 12;
        if(num>0){
            System.out.println("Pozitif");
            int number = 3;
            if(number> -1 && number< 10){
                System.out.println("Rakam");
                String y ="aac";
                char ch = y.charAt(0);
                if(y.indexOf(ch)==y.lastIndexOf(ch)){
                    System.out.println(ch);
                }
                char ch2 = y.charAt(1);
                if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
                    System.out.println(ch2);
                }
                char ch3 = y.charAt(2);
                if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
                    System.out.println(ch3);
                }
                int n = -123;
                n= Math.abs(n);
                if(n>99 && n <1000){
                    System.out.println("Wooow!");
                }

            }
        }



    }
}
