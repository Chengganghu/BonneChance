package fr.lille.imt.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer,String> hashMap = new HashMap<>();
        linkedHashMap.put(9,"9");
        linkedHashMap.put(7,"7");
        linkedHashMap.put(1,"1");
        linkedHashMap.put(3,"3");
        hashMap.put(9,"9");
        hashMap.put(3,"3");
        hashMap.put(5,"5");
        for(Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getValue());
        }
        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
