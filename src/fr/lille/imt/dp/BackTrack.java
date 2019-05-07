package fr.lille.imt.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackTrack {
    public static List<String> output = new ArrayList<>();
    public static Map<String,String> phone = new HashMap<String,String>(){{
        put("2","abc");
        put("3","def");
        put("4","ghi");
        put("5","jkl");
        put("6","mno");
        put("7","pqrs");
        put("8","tuv");
        put("9","wxyz");
    }};

    public static void backTrackReviser(String res, String left){
        if(left.length() == 0){
            output.add(res);
        }else{
            String next = left.substring(0,1);
            char[]letters = phone.get(next).toCharArray();
            for(char c:letters){
                backTrack(res+c,left.substring(1));
            }
        }
    }


    public static void backTrack(String res, String next){
        if(next.length() == 0)
            output.add(res);
        else{
            String nextDigit = next.substring(0,1);
            String nextLetter = phone.get(nextDigit);
            for(int i=0;i<nextLetter.length();i++){
                char letter = nextLetter.charAt(i);
                backTrack(res+letter,next.substring(1));
            }
        }
    }

    public static List<String> letterCombinations(String digits){
        if(digits.length() == 0) return new ArrayList<>();
        backTrack("",digits);
        return output;
    }













}
