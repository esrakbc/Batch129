package day05typecastingstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);
        String s1 = s.replace("money","dollar");
        System.out.println(s1);
        String s2 = s.replace("earn", "win");
        System.out.println(s2);
        String s3 = s.replace("a","*");
        System.out.println(s3);
        String s4 = s.replace("n","xxx");
        System.out.println(s4);
        String s5 = s.replace("e","");
        System.out.println(s5);
        String t = "Ali 13 yasındadır";
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);
        String t6 = t.replaceAll("[^ ]","+");
        System.out.println(t6);
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);



    }
}
