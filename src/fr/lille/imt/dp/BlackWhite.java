package fr.lille.imt.dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BlackWhite {
    public static List<int[]> output = new LinkedList<>();
    public static void solution(int[] res,int index,int n){
        if(index == n){
            int[] tmp = new int[n];
            for(int i=0;i<n;i++){
                tmp[i] = res[i];
            }
            output.add(tmp);
            return;
        }else{
            if(index == 1||index == 0){
                res[index] = 0;
                solution(res,index+1,n);
                res[index] = 1;
                solution(res,index+1,n);
            }else{
                if(res[index-1] == res[index-2]){
                    res[index] = 1 - res[index - 1];
                    solution(res,index+1,n);
                }else{
                    res[index] = 0;
                    solution(res,index+1,n);
                    res[index] = 1;
                    solution(res,index+1,n);
                }
            }
        }
    }

    public static void main(String[] args) {
        solution(new int[2],0,2);
    }
}
