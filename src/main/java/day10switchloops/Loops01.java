package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //example:ekrana  5 kere hi yazdırınız.
        //1.yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        // 2.yol
        //aynı adımlar tekrar tekrar yapılması gerektiğinde looplar kullanılır
        // 4 tane loop var; 1)for-loop 2)while-loop 3) do-while-loop 4) for-each-loop
        // for-loop
        //baslangıc değer  loop un calısma şartı   increment/decrement
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }
        //example 2: 11 den 44 e kdr tümsayıları ekrana yazdıran kodu bulunuz.
        for (int i = 11; i < 45; i++) {
            System.out.println(i);
        }
        // exp 3:40 dan 23 e kdr tüm çift tamsayıları ekrana yazdıran kodu yazınız
        for (int i = 40; i > 22; i = i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
            //exp 4: 18 den 56 ya kdr tüm tek tamsayıları ekrana yazdıran kodu yazınız.
            for (int i = 18; i < 57; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

