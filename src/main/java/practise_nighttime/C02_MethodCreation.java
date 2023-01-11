package practise_nighttime;

public class C02_MethodCreation {
    public static void main(String[] args) {
        System.out.println("Dikdörtgenin Alanı :"+dikdörtganAlanı(10, 5));


        System.out.println("Dikdörtgenin Cevresi :"+dikdörtgenCevre(12, 45));
        kareninAlanı(25);

    }
    public static int dikdörtganAlanı(int a, int b){
        return a*b;

    }
    public static int dikdörtgenCevre( int a , int b){
        return 2*(a+b);
    }
    public static void kareninAlanı ( int a){
        System.out.println("Karenin alanı :"+(a*a) );
    }


}
