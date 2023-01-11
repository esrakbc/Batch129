package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //ex1: Verilen bir Lİst teki elemanları  tekrarsız olarak yazdırın//İnterview sorusu
        //   [2,3,2,2,3,5]==> [2,3,5]
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        List<Integer> newList = new ArrayList<>();
        for (Integer w : myList){
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);
        //ex2:Müşteriden ürün ismi alınız
        //    Müşterinin ismini verdiği ürün listede varsa ürünün ismini yazdırınız
        // Müşterinin ismini verdiği ürün listede yoksa "Out of stock" yazdırınız
        Scanner input = new Scanner(System.in);

         List<String> products = new ArrayList<>();
         products.add("TV");
         products.add("Radio");
         products.add("Ipad");
         products.add("Notebook");
         products.add("Headphone");
         products.add("Mobile Phone");
         do {
             System.out.println("Aradığınız ürünün ismini giriniz");
             System.out.println("Ürun aramayı sonlandırmak için q ya basınız");
             String p =input.nextLine();
             String product =input.nextLine();
          if (product.equalsIgnoreCase("Q")) {
              break;
          } else if (products.contains(p)) {
              System.out.println(p + " is in stock");
          }else {
              System.out.println(p + " is out of stock!..");
          }
         }while (true);
        System.out.println("sitemizi kullandığınız için teşekkür eder tekrar bekleriz");









    }


}
