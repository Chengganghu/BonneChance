package fr.lille.imt.pdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Language {
    public static int people;
    public static int languages;
    public static int[] arr;
    public static int output;
    public static int mininum = Integer.MIN_VALUE;
    public static void input(){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        people = Integer.parseInt(str[0]);
        languages = Integer.parseInt(str[1]);
        arr = new int[languages];
        String[] tmp = sc.nextLine().split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }
    }

    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        input();
        min(arr);
        boolean flag = true;
        while(flag){
            flag = solution();
        }
        System.out.println(output);
    }

    public static boolean solution(){
        if(people==sum(arr))
            return false;
        else if(people > sum(arr)){
            output--;
            return false;
        }
        else{
            people --;
            output++;
            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0)
                    arr[i] --;
                else
                    return false;
            }
            return true;
        }
    }

    public static int sum(int[] arr){
        int res = 0;
        for(int n:arr){
            res += n;
        }
        return res;
    }

    public static void min(int[]arr){
        for(int i:arr){
            mininum = Math.min(i,mininum);
        }
    }

}
