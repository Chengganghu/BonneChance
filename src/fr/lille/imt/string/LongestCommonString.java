package fr.lille.imt.string;

public class LongestCommonString {
    public static String solution(String str1,String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        //if empty
        if(length1 == 0||length2 == 0) return null;

        int longestIndex1 = -1;
        int longestIndex2 = -1;
        int max = 0;
        int[][] table = new int[length1][length2];

        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    if(i == 0|| j==0) {
                        table[i][j] = 1;
                        if(table[i][j]>max){
                            max = table[i][j];
                            longestIndex1 = i;
                            longestIndex2 = j;
                        }
                    }
                    else{
                        table[i][j] = table[i-1][j-1]+1;
                        if(table[i][j]>max){
                            max = table[i][j];
                            longestIndex1 = i;
                            longestIndex2 = j;
                        }
                    }
                }
            }
        }
        return str1.substring(longestIndex1-max+1,longestIndex1+1);
    }

    public static void main(String[] args) {
        System.out.println(solution("sfhuchengganghusaf","chenggangsldjflsd"));

    }
}
