package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {
        //Ex:Bir integer multidimensional array oluşturunuz
        //Bu arraydeki tüm elemanların carpımını console a yazdıran kodu yazınız
        int a[][] ={{2,5},{4,7,11}};
        int carpım =1;
        for (int[] w : a){
            for (int k : w){
                carpım = carpım*k;

            }
        }
        System.out.println(carpım);







    }
}
