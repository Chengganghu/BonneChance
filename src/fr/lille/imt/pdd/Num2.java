package fr.lille.imt.pdd;

import java.lang.reflect.Array;
import java.util.*;

public class Num2 {
    public static void main(String[] args) {
        input();
        System.out.println(solution(inputN,inputList));
    }

    public static LinkedList<Integer> inputList = new LinkedList<>();
    public static int inputN ;
    public static int solution(int n, LinkedList<Integer> list){
        int res = 0;
        Collections.sort(list);
        while(!list.isEmpty()){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)!=list.get(i+1)){
                    list.remove(i);
                    i--;
                }
            }
            list.removeLast();
            res++;
        }
        return res;
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        inputN = Integer.parseInt(scanner.nextLine());
        String[] tmp = scanner.nextLine().split(" ");
        for(String s:tmp){
            inputList.add(Integer.parseInt(s));
        }
    }
}
