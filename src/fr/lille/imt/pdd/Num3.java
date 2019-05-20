package fr.lille.imt.pdd;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        input();
        if(s1.length() == 0||s2.length() == 0||s1.length()!=s2.length())
            System.out.println(0);
        List<String> tmp = transfer(s1);
        Collections.sort(tmp);
        System.out.println(tmp.contains(s2)?1:0);
    }

    public static List<String> transfer(String s){
        List<String> list = new LinkedList<>();
        if(s.length() == 1){
            list.add(s);
            return list;
        }else{
            for(int i=1;i<s.length();i++){
                List<String> list1 = transfer(s.substring(0,i));
                List<String> list2 = transfer(s.substring(i));
                for(int k=0;k<list1.size();k++){
                    for(int p=0;p<list2.size();p++){
                        String tmp1 = list1.get(k)+list2.get(p);
                        String tmp2 = list2.get(p)+list1.get(k);
                        if(!list.contains(tmp1)) list.add(tmp1);
                        if(!list.contains(tmp2)) list.add(tmp2);
//                        list.add(tmp1);
//                        list.add(tmp2);
                    }
                }
            }
        }
        return list;
    }
    public static String s1;
    public static String s2;
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
    }
}
