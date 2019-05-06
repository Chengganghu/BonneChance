package fr.lille.imt.pdd;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        input();
        boolean flag = true;
        while(flag){
            flag = solution();
        }
        System.out.println(times);
    }
    private static List<Character> input = new ArrayList<Character>();
    private static int times;
    public static boolean solution(){
        for(int i=0;i<input.size()-1;i++){
            if(input.get(i) == input.get(i+1)){
                input.remove(i+1);
                input.remove(i);
                times ++;
                return true;
            }
        }
        return false;

    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        for(int i=0;i<tmp.length();i++){
            input.add(tmp.charAt(i));
        }
    }
}
