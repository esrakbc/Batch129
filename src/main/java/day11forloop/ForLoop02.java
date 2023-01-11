package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //ex:1 Verilen bir String de 'a' karakteri hariç tüm karakterleri yazdırın.
        //"Madagaskar"
        String s= "Madagaskar";
        //1.yol
        String t =s.replace("a","");
        System.out.print(t);
        //2.yol
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if ( ch!='a'){
                System.out.print(ch);
            }
        }
        //.3.yol
        for (int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if (ch=='a'){
                continue;//continue keyword u bazı şartlar için loop'un adımlarını atlamamızı sağlar
            }
            System.out.print(ch);
        }
    }
}
