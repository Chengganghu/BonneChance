package fr.lille.imt.pdd;

import java.util.*;

public class Buildling {
    public static void main(String[] args) {

    }
    public static List<Integer> list = new LinkedList<>();
    public static Map<Integer,Integer> map= new HashMap<Integer,Integer>();
    public static void sort(){
        for(Integer i:list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
    }
    public static int buildings;
    public static int need;

    public static void input(){
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        buildings = Integer.parseInt(tmp[0]);
        need = Integer.parseInt(tmp[1]);
        tmp = sc.nextLine().split(" ");
        for(int i=0;i<buildings;i++){
            list.add(Integer.valueOf(tmp[i]));
        }
    }
}
