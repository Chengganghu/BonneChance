package fr.lille.imt.dp;

import java.util.ArrayList;
import java.util.List;

public class AllStrings {
    public static List<String> output = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abcd";
        char[] array = s.toCharArray();
        solution(array,0,array.length-1);
    }
    public static void solution(char[] array,int start,int end){
        if(start == end){
            output.add(new String(array));
        }else{
            for(int i = start;i<=end;i++){
                swap(array,start,i);
                solution(array,start+1,end);
                swap(array,start,i);
            }
        }

    }

    public static void swap(char[]arr,int index1,int index2){
        char tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
