package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Arrayes02 {
    public static class Arrays01 {
        public static void main(String[] args) {
            //ex1:Kullanıcı ile beraber bir array oluşturunuz.
            Scanner input = new Scanner(System.in);
            System.out.println("Kaç öprenci ismi girecekseniz");
            System.out.println("Girişi sonlandırmak için Q tuşuna basınız");
            int numOfElements = input.nextInt();

            String stdNames[] = new String[numOfElements];
            for (int i=1; i<=numOfElements; i++){
                System.out.println("Lutfen "+ i + ". öğrencinin adını giriniz");

                String stdName = input.next();
                if (stdName.equalsIgnoreCase("Q")){
                    break;
                }

                stdNames[i-1] =stdName;
            }
            System.out.println(Arrays.toString(stdNames));


        }
    }

    public static class Arrays02 {
        public static void main(String[] args) {
            //Ex2:bir stringdeki sesli harflerin sayısını veren kodu yazınız
            // a-e-i-o-u-A-E-I-O-U
            String s = "Java brings you money";
            //1.yol:use ReplaceAll
            int vowels=s.replaceAll("[^aeiouAEIOU)]"," ").length();
            System.out.println(vowels);
            //2.yol: use  array-loop
            String letters[]= s.split("");
            System.out.println(Arrays.toString(letters));
            int counter =0;
            for (String w : letters){
                switch (w.toLowerCase()){
                    case "a":
                    case "e":
                    case "i":
                    case  "o":
                    case "u":
                        counter++;
                }
            }
            System.out.println(counter);





        }
    }
}
