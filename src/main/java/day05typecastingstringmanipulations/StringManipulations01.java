package day05typecastingstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s = "Java is easy";
      String sUpper = s.toUpperCase(Locale.ROOT);
        System.out.println(sUpper);
       String sLower =  s.toLowerCase();
        System.out.println(sLower);
       char firstChar = s.charAt(0);
        System.out.println(firstChar);
      char secondChar = s.charAt(1);
      char secandLastChar = s.charAt(10);
      int sLength = s.length();
        System.out.println(sLength);
       String sub1= s.substring(0,4);
        System.out.println(sub1);
        String sub2 = s.substring(5,7);
        System.out.println(sub2);
        String sub3 = s.substring(8,12);
        System.out.println(sub3);
        String sub4 = s.substring(8);
        System.out.println(sub4);
         Boolean isExist = s.contains("easy");
        System.out.println(isExist);
        Boolean isExist2 = s.contains("money");
        System.out.println(isExist2);
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);




    }
}
