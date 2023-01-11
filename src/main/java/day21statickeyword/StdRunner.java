package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static olduğundan ,ona ulaşmak için object oluşturmadım
        //Sadece class ismini kullanmak yeterli.
        System.out.println(Student.stdName);
        //age non-static olduğundan ona ulaşmak için object
        //oluşturmak zorundayız.
        Student std1 =new Student();
        System.out.println(std1);



       String  inıtials =Student.getInıtials("Tom Cruise");
        System.out.println(inıtials);

        int vowels =std1.countVowels("Tom Cruise");
        System.out.println(vowels);

        //Static olanları object ile çağırmak tavsiye edilmez.


        //List oluşturmada yeni bir ışıltı:
         List<String> names=List.of("Ali","Veli","Can","Kemal");
        System.out.println(names);


    }
}
