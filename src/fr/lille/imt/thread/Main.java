package fr.lille.imt.thread;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i == 0) sc.nextLine();
            String input = sc.nextLine();
            String tmp = func1(input);
            input = func2(tmp);
            System.out.println(input);
        }
    }

    public static String func1(String s){
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(char c:chars){
            list.add(c);
        }
        for(int i=0;i<list.size()-2;i++){
            if(list.get(i) == list.get(i+1)&&list.get(i) == list.get(i+2)){
                list.remove(i+2);
                i--;
            }
        }
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }

    public static String func2(String s){
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(char c:chars){
            list.add(c);
        }
        for(int i=0;i<list.size()-3;i++){
            if(list.get(i) == list.get(i+1) && list.get(i+2) == list.get(i+3)){
                list.remove(i+2);
                i++;
            }
        }
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}