package fr.lille.imt.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Chenggang on 17/12/13.
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
 * "pwke" is a subsequence and not a substring.
 *
 */



public class SubString {
    /**
     * Approach #1 Brute Force [Time Limit Exceeded]
     */
    public int lengthOfLongestSubString (String s){
        int length = s.length();
        int ans = 0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(allUnique(s,i,j)) ans = Math.max(ans,j-i);
            }
        }
        return ans;

    }

    public boolean allUnique(String s ,int start ,int end){//判断指定字符字串是否不含有重复字符

        Set<Character> set;
        set = new HashSet<Character>();
        for(int i =start;i<end;i++){
            Character ch = s.charAt(i);         //check firstly whether current char is already in the string ,
            if(set.contains(ch)) return false;  //if not,secondly add this char into string
            set.add(ch);
        }
        return true;
    }
    /**
     * Approach #2 Sliding Window [Accepted]
     */
    public int lengthOfLongestSubstringApproach2(String s){
        int length = s.length();
        Set<Character> set = new HashSet<Character>() ;
        int ans =0,i=0,j=0;
        while(i<length&&j<length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    /**
     * Approach #3
     */
    public int lengthOfLongestSubstringApproach3(String s){
        int length = s.length(),ans=0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();   //key值存字符，value值存下标值
        for(int j=0,i=0;j<length;j++){
            if(map.containsKey(s.charAt(j)))
                i=Math.max(map.get(s.charAt(j)),i);
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
