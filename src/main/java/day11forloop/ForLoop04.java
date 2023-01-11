package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //ex: 5 den 8 e kdr tamsayıların toplamını veren kodu yazınız.interwiew
        //5+6+7+8==>26
        int sum=0;// memory de toplam için yer ayırdık
        for ( int i = 5;i<9 ;i++  ){
            sum= sum + i;
        }
        System.out.println(sum);
        //Ex2:7 den 9 a kdr tamsayıların çarpımını veren kodu yazınız
        int multiply = 1;
        for (int i =7; i<10;i++){
            multiply=multiply*i;
        }
        System.out.println(multiply);
    }
}
