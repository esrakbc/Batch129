package day05typecastingstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        int a= 12;
        int b = 5;
        int temp = 0;

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        int x = 12;
        int y = 5;
        x = x + y ;
        y = x - y ;
        x = x - y ;

    }
}
