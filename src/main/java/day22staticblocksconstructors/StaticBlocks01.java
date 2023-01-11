package day22staticblocksconstructors;

public class StaticBlocks01 {
    //Bir variable oluşturduğunuzda ,değer atamazsanız o variable'ı "initialize"etmediniz demektır.(başlatmadınız)
    //Static variable'lar static block'lar içinde initialize edilirse o class'ın içinde herşeyden önce hazır hale
    //getirilmiş olur.
    //Bazen main method çalıştırılmadan önce variable'ların hazır hale getirilmesi gerekir.Bu yüzden static block'lar
    //kullanılır.
    //Note1=Static block'lar static variable'ları initialize etmek için kullanılırlar.
    //Note2=Static block'lar class içinde "herşeyden önce"çalıştırılırlar.
    static  double pi;
    static  String shape ;
       static {
           pi=3.14;
           System.out.println("Static block 1 ");
       }
       static {
           shape="Circle";
           System.out.println("Static block 2");
       }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(pi);

    }
}
