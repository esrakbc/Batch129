package day19listsvarargs;

public class Varargs01 {
    //Varargs lar method oluştururken "parametre" sayısında bize kolaylık sağlar
    //istediğiniz sayıda sayıyı toplamak için oluşturunuz
    //bir methotta birden fazzla varargs parametre kullanılmaz çünkü 2.si "unreachable code"olur.
    //Varargs ,varargs dışındaki parametrelerle kullanılabilir ama Varargs her zaman son parametre olmalıdır
    public static void main(String[] args) {
        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);
        add(4,5,6,7,8,9);


    }
    //İki sayıyı kotlayan method oluşturunuz
    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    }
    //uç sayıyı toplayan method oluştururum
    public static void addThreeNumbers(int a , int b , int c){
        System.out.println(a+b+c);
    }
    //istediğiniz sayıda sayıyı toplamak için bir method oluşturunuz
    public static void add(int...a){
        int sum = 0;
        for (int w : a ){
            sum =sum + w;
        }
        System.out.println(sum);
    }










}
