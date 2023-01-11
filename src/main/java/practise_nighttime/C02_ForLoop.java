package practise_nighttime;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //Girilen bir stringin harflerini teker teker ekrana alt alta gelecel şekilde yazdırınız
        //boşluk " " veya 'a' harfi geldiğinde bunşarı yazmasın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == ' ') {
            continue;
        }
            System.out.println(str.charAt(i));
    }






    }
}
