package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex1:Verilen bir String de ilk 'a' harfinden önceki tüm karakterleri console'yazdırın
       // "I love Java "
        String s = "I love Java ";
        for ( int i = 0 ; i<s.length() ;i++){
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println( );
        //ex2: Verilen bir String de son 'a' dan sonraki tüm karakterleri ters sırada yazdırınız
        // "Germany"
         String t = "Germany";
        for (int i=t.length()-1; i>=0 ;i--){
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }
    }
}
