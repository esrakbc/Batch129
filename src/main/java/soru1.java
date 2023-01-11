import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*
         * * * *
         * * *
         * *
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen row sayısını giriniz");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int y = row; y >= i; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
