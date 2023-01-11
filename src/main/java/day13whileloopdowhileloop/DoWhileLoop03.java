package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*
        Username="admin" ve Password="pwd123" dur.
        Kullanıcıdan username ve password u alın.
        Username ve password dogru ise console a "Hesanınıza hosgeldiniz!" yazdırın.
        Username veya password yanlıs ise console a "3 kere"Username ve Passwordunuzu giriniz"yazdırınız
        Username veya password 4.kere yanlıs girilirse "Hesabınız bloke olmuştur"mesajı vererek islemi tamamlayınız
         */
        Scanner input=new Scanner(System.in);

        int counter = 0;
        do {
            if (counter==4){
                System.out.println("Hesabınız bloke olmustur!");
                break;
            }
            System.out.println("Username i giriniz");
            String username = input.next();
            System.out.println("Password u giriniz");
            String password = input.next();
            if (username.equals("admin")&& password.equals("pwd123")){
                System.out.println("Hesabınıza hosgeldiniz!");
                break;

            }
            counter++;

            System.out.println("");
        }while (true);


    }
}
