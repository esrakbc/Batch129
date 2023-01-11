package practise_nighttime;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Techpro spor salonuna hosgeldiniz....");
        System.out.println("Lutfen adınızı soyadınızı giriniz...");
        String tamIsim = input.nextLine();
        System.out.println("Lutfen yasınızı giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz");
        double kılo = input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylıkUcret = 20;
        System.out.println("aylık ucret "+ aylıkUcret+ "$");
        System.out.println("Lutfen kac ay devam edecegınızı girin");
        int aylık = input.nextInt();
        int toplam_tutar = aylıkUcret*aylık;
        System.out.println("toplam_tutar =  "+ toplam_tutar+ "$");







    }
}
