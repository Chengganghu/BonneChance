package fr.lille.imt.pdd;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        input();
        System.out.println(compareVersion(s1,s2));
    }


    public static int compareVersion(String v1,String v2){
        if(v1 == null||v2 == null) throw new IllegalArgumentException("not null");

        String[]arr1 = v1.split("\\.");
        String[]arr2 = v2.split("\\.");

        int minIndex = Math.min(arr1.length,arr2.length);
        int i = 0;
        while(i<minIndex){
            if(Integer.parseInt(arr1[i]) == Integer.parseInt(arr2[i]))
                i++;
            else if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])){
                return -1;
            }
            else
                return 1;
        }
        if(arr1.length == arr2.length) return 0;
        else if(arr1.length>arr2.length) return 1;
        else return -1;
    }
    public static String s1,s2;
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
    }
}
