package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //ex1:Bir tane integer list oluştur, sonra da bu list te birbirine en yakın iki tamsayıyı yazınız
        // [12,23,9,11,35]==>12,11 (Interview sorusu)
        // 12 23 9 11 35 ==> sort()yap==> 9 11 12 23 35
        List<Integer>nums= new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
        Collections.sort(nums);
        System.out.println(nums);//[9,11,12,23,35]
        int minDiff = nums.get(1) - nums.get(0);
        for (int i =1; i< nums.size(); i++){
            minDiff=Math.min(minDiff,nums.get(i)-nums.get(i-1));

        }
        System.out.println(minDiff);
        for (int i =1; i< nums.size(); i++){
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i) + " and "+ nums.get(i-1));
            }

        }


    }
}
