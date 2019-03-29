package fr.lille.imt.dp;

public class Fib {
    public static int solution(int n){
        int [] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;
        for(int i=2;i<=n;i++){
            memo[i] = memo[i-1]+memo[i-2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
