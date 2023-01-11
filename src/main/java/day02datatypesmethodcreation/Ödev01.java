package day02datatypesmethodcreation;

public class Ödev01 {
    public static void main(String[] args) {
        int sonuc = rectangularArea(5,6);
        System.out.println(sonuc);

        long sonuctwo = rectangularPerimeter(3,6);
        System.out.println(sonuctwo );

       double sonucthree = areaCircle(2,3.14);
        System.out.println(sonucthree);

       double sonucfour =  perimeterCircle(4,3.14);
        System.out.println(sonucfour);


         {

        }



    }
    public static  int rectangularArea(int a , int b){
       return a*b ;
    }
    protected static  long rectangularPerimeter(int a, int b){
        return 2*(a+b);

    }
    public static double areaCircle(double r , double p ){
        return p*r*r;
    }
    protected static  double perimeterCircle(int r, double p){
        return 2*p*r;
    }
}
