package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //ex:size verilen bir string'İ tersten yazınız
        // "Germany"==>ynamryeG
        String s = "Germany";
        String t =" ";
        for (int i =s.length()-1;i>=0;i--){
            t= t+ s.charAt(i);
        }
        System.out.println(t);
        //size verilen bir String in "Palindrome" olup olmadığını kontrol eden kodu yazınız
        // civic, nalan ==>palindrome
        // String i ters çevir sonra da düz hali ile ters halini karşılaştır ,aynı ise "palindrome"
        String duz="civic";

        String ters="";
        for (int i=duz.length()-1;i>=0;i--){
            ters= ters+ duz.charAt(i);
        }
        if (duz.equals(ters)){
            System.out.println("Bu String palindrome'dur");
        }
    }
}
