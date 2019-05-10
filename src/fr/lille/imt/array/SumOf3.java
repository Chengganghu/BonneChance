package fr.lille.imt.array;

import java.util.*;

public class SumOf3 {

    public static List<List<Integer>> threeSum(int[] num){
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0;i<num.length-2;i++){
            if(i == 0 || num[i] != num[i - 1]){
                int lo = i+1,hi=num.length-1,sum = 0-num[i];
                while(lo<hi){
                    if(num[lo]+num[hi] == sum){
                        res.add(Arrays.asList(num[i],num[hi],num[lo]));
                        while(lo<hi&&num[lo]==num[lo+1]) lo++;
                        while(lo<hi&&num[hi]==num[hi-1]) hi--;
                        lo++;hi--;
                    }else if(num[lo]+num[hi]>sum) hi--;
                    else lo++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]num={-1,-6,-3,-7,0,3,5,6,9,10,-5,-11,14};
        List<List<Integer>> ouput = threeSum(num);
    }
}
