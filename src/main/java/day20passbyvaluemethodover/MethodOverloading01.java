package day20passbyvaluemethodover;
   /*
  1)Method Overloading yaparken method ismi değiştirilmez.
  2) Method Overloading yaparken parametreler değiştirilir.
   i) Parametre değiştirken, parametrelerin data type ları değiştirilelebilir.
   ii) Parametre değiştirken,"parametrelerın data type ları farklı ise yerleri değiştirilebilir.
   iii) Parametre değiştirirken , parametrelerin sayısı değiştirilebilir.
   3)java için "ismi" ve "parametreleri" aynı olan iki method tamamıyla aynıdır.
     Bu yüzden isim ve parametre "Method Signature" olarak adlandırılır.
     4) Method Overloading oluştururken return type ı değiştirmenin hiçbir etkisi yoktur.
        Method Overloading oluştururken acces modifier i değiştirmenin hiçbir etkisi yoktur.
        Method Overloading oluştururken methodu static yada non static yapmanın hiçbir etkisi yoktur.
        Method Overloading oluştururken method body i değiştirmenin hiçbir etkisi yoktur.
      5) "private" method'lar overload edilebilir .Çunku method loading sadece bir class içinde olur."private"olmak
      ise başka class lara gidildiğinde problem olabilir.
      6) "Static" methodlar overload edilebilir.
   */

      public class MethodOverloading01 {
      public static void main(String[] args) {
        add(3,5 );

    }

    private static void add(int a, int b) {
       System.out.println(a+b);
    }
    private static void add(double a , double b){
        System.out.println(a+b);
    }
    private   static void add(double a, int b ){
        System.out.println(a+b);
    }
    private static  void add(int a , double b){
        System.out.println(a+b);
    }

    private static  void add(int a,int b , int c){
        System.out.println(a+b);
    }


}
