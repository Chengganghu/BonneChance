package fr.lille.imt.string;

import java.util.HashMap;

public class FirstUniqueString {
    public static int solution(String str){
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:chars){
            if(map.containsKey(c)){
                int tmp = map.get(c);
                map.put(c,++tmp);
            }else{
                map.put(c,1);
            }
        }


        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution("cvnbgfhgfddgfhdghdghfdgfhnjssgoogle"));
    }
}
