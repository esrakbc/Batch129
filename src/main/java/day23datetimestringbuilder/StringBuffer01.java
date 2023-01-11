package day23datetimestringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        String oluşturmak için String Class,StringBuilder Class ve StringBuffer kullanılabilir
        1)StringBuffer Java'nın String üretmek için oluşturduğu class tır.Java 5 de üretilmiştir
        2)StringBuffer "synchronized" dir.StringBuilder "synchronized" değildir
        3)StringBuffer  "thread-safe"(multi-thread'e uygun) dir,StringBuilder "thread-safe" değildir
        4)StringBuffer ve StringBuilder ikisi de mutable dir.

        note1:Immutable String lazım olduğunda String Class kullanırız
        note2:Mutable String lazım olduğunda StringBuilder veya StringBuffer kullanırız
        note3:StringBuffer "Multithread" ve "Synchronization lazım olduğunda tercih edilir
              StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
         */
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);
        System.out.println(sbf.capacity());

    }
}
