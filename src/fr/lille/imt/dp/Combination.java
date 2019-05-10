package fr.lille.imt.dp;

import java.util.LinkedList;
import java.util.List;

public class Combination {
    public static List<List<Integer>> output = new LinkedList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        solution(candidates,target,new LinkedList<Integer>(),0);
        return output;
    }

    public static void solution(int[] candidates, int target,List<Integer> res,int start){
        if(target == 0){
            output.add(new LinkedList<>(res));
            return;
        }else if(target <0)
            return;
        else{
            for(int i = start;i<candidates.length;i++){
                res.add(candidates[i]);
                solution(candidates,target-candidates[i],res,i);
                res.remove(res.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,4};
        combinationSum(arr,8);
    }
}
