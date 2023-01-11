package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        int year =2005;
        String result = ( year%100 == 0) ? (year%400 ==0  ?"Leap" : "Not Leap")  :  (year%4==0  ? "Leap " : "Not Leap");
        System.out.println(result);
        }
    }

