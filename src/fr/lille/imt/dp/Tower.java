package fr.lille.imt.dp;

public class Tower {

    public static void solution(int n, char from, char inter,char to){
        if(n == 1){
            print(n,from,to);
        }else{
            solution(n-1,from,to,inter);
            print(n,from,to);
            solution(n-1,inter,from,to);
        }
    }

    public static void print(int n, char from, char to){
        System.out.println(n+"-"+from+"-"+to);
    }

    public static void main(String[] args) {
        solution(3,'A','B','C');
    }
}
