package fr.lille.imt.dp;

import java.util.LinkedList;
import java.util.List;

public class AllStringReviser {
    public static List<String> output = new LinkedList<>();

    public static void solution(char[] arr,int start, int end){
        if(start == end)
            output.add(new String(arr));
        else{
            for(int i=start;i<end;i++){
                swap(arr,start,i);
                solution(arr,start+1,end);
                swap(arr,start,i);
            }
        }
    }
    public static void swap(char[] arr,int index1,int index2){
        char tmp = arr[index1] ;
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }










































    private static List<String> sortie = new LinkedList<>();

    public static void reviserSolution(char[] arr, int start,int end){
        if(start == end)
            sortie.add(new String(arr));
        else{
            for(int i=start;i<end;i++){
                swap(arr,i,start);
                reviserSolution(arr,start+1,end);
                swap(arr,i,start);
            }
        }

    }
}
