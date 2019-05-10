package fr.lille.imt.toward.offer;

public class Num3 {
    public static boolean find(int[][]matrix,int number){
        if(matrix == null) return false;
        int rows = matrix.length;   //行数
        int cols = matrix[0].length;//列数

        int row = 0;
        int col = cols - 1;

        for(;row<rows;row++){
            for(;col>=0;col--){
                if(matrix[row][col] == number)
                    return true;
                else if(matrix[row][col]<number){
                    break;
                }else{
                    continue;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(matrix,1));
    }
}
