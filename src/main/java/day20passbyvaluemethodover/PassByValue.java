package day20passbyvaluemethodover;

public class PassByValue {
    public static void main(String[] args) {
        /*
        1) Java "pass by value " sayesinde variable ların orijinal değerlerini koruma altına alır.
        */
        double shirt =100;
       double studentShirtPrice= discount ("student", shirt );
       double veteranShirtPrice = discount("veteran", shirt);
       double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt);
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtPrice);
        System.out.println(seniorShirtPrice);
        shirt = discount("veteran",shirt);
        System.out.println(shirt);
    }
    public static double discount(String state, double shirt){
        switch (state){
            case "student ":
                shirt = shirt  *0.90;
                break;
            case "veteran" :
                shirt = shirt  *0.80;
                break;
            case "senior":
                shirt = shirt *0.95;
                break;
            default:
                shirt = shirt;
        }
         return shirt ;
    }
}
