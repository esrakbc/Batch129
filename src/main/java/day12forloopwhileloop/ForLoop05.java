package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {
        //hiç sayı kullanmadan 1 den 100 e kdr olan sayıları console a yazdırın
        for (int i= 'd'/'d';i <='d';i++){
            System.out.print(i +" ");

        }
        //note:bazı loop'lar hiç çalışmayabilir
        for (int i =1;i<10;i--){
            System.out.println("Hi");// zero execution
        }
        //note2: bazı looplar sonsuz defa çalışabilir.
        //bu tarz looplara "infinite(sonsuz)Loop"denir
        // İnfinite loop genellikle "increment/dicrement"kısmında yapılan hatadan kaynaklanır
        for (int i =1; i<10;i--){
            System.out.println("Java is money....");
        }
        //note3: başka bir "infinite (sonsuz)Loop"
        //loop oluşturduğunuzda "ikinci kısmı"yazmazsanız "infinite Loop" olur
        for (int i=1; ; ){
            System.out.println("Hi!");
        }
    }
}
