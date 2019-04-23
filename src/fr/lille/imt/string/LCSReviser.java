package fr.lille.imt.string;

public class LCSReviser {

    public static int solution(String str1,String str2){
        if(str1 == null&&str2==null) return 0;
        int[][] dp = new int[str1.length()][str2.length()];
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    if(i>0&&j>0){
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else
                        dp[i][j] = 1;
                }else
                    dp[i][j] = 0;
            }
        }
        int res = 0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(solution("","chenggnaghu"));

    }
}
