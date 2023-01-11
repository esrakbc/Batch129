package practise_nighttime;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class c06 {
    public static void main(String[] args) {
        //hacker dili ("Java ile hersey güzel")
        //h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle =input.nextLine().toLowerCase();
        String arr[] = new String[cumle.length()];

        for (int i = 0; i< cumle.length();  i++){
            arr[i] =cumle.substring(i,i+1);
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
