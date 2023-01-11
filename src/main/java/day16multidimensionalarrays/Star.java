package day16multidimensionalarrays;

public class Star {
    public static void main(String[] args) {
        /*
        Asağıdaki şekli çizen kodu yazınız
                                *  // 9 tane karaketer var 5x2-1 yapacağız
                               * * / 3
                              *   * /5
                             *     * /7 yani boşluk sonra *
                            * * * * *
                            önce dikdörtgene tamamla,boşluklara bak
        */
        int row = 5;
        for (int i =1;i<=row;i++){
            for (int k =i; k<row;k++ ){
                System.out.print(" ");//boşluklar için.
            }
            for (int m = 1;m<=2*i-1;m++){
                if (i==row || m==1 || m==2*i -1 ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
