package day21statickeyword;

public class Student {

        /*
        1)static variable veya static method'lar (class member) tüm object'ler için ortak elemandır.
        2)static class member'lar üzerinde yapılan tum değişiklikler rum object'leri etkiler.
        3)static class member'ler Class'a ,non- static class member'ler tum object'lere monte edilir.
        Mesela bir class 'dan 100 tane object oluşturduğunuzda non-static olanlar 100 kere oluşturulur,ama
        static olanlar object sayısından bağımsız olarak bir kere oluşturulur.
        4)static class member'lere ulaşmak için object oluşturmaya gerek duyulmaz,ama non-static class member'lere
        ulaşmak için object oluşturmak şarttır.
        5)Static variable nin diğer bir adı "Class variable"dır.
          Non static variable nın adı "Instance Variable" veya "Object Variable"dır.

         */

    public static String stdName = "Tom Hanks";

    public int age = 13;
    //Öğrenci isminin ilk harflerini veren methodu oluşturunuz.
    public static String getInıtials(String name){
        String first = name.substring(0,1);
        String second =name.split(" ")[1].substring(0,1);
        return  first + second ;

    }
    //Ogrenci ismindeki sesli harfleri sayan(a,e,i,o,u) sayan method oluşturunuz.
    public int countVowels(String name){
        int counter=0;
        for (int i=0;i<name.length();i++){
            char ch =name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                counter++;
                break;
            }
        }
        return counter;
    }
}










