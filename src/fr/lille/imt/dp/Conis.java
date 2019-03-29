package fr.lille.imt.dp;

import java.util.Arrays;

public class Conis {
    static int[] coins = {1,2,4,10};

    public static int solution(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,1025);
        dp[0] = 0;
        for(int i=1;i<n+1;i++){
            for(int j =0 ;j < 4; j ++){
                if(dp[i-coins[j]]+1<dp[i])
                    dp[i] = dp[i-coins[i]+1];
            }
        }
        return dp[n];
    }
}
