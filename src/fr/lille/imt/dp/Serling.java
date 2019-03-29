package fr.lille.imt.dp;

import java.util.Arrays;

public class Serling {
    public final static int[] P = {1,5,8,9,10,17,17,20,24,30};

    public static int solution1(int[] p ,int n){
        if(n == 0) return 0;
        int q = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            q = Math.max(q,p[i-1]+solution1(p,n-i));
        }
        return q;
    }

    public static int solution2(int[] p, int n){
        int[] dp = new int[n+1];
        int res = Integer.MIN_VALUE;
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] = Math.max(dp[i],dp[i-j]+p[j-1]);

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("solution1 : "+solution1(P,4));
        System.out.println("solution2 : "+solution2(P,4));
    }
}
