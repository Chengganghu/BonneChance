/**
 * 冒泡排序
 */
package fr.lille.imt.sort;

public class BubbleSort {
    public static int[] solution(int[] array){
        if(array.length == 0)
            return array;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = {4,5,76,423,5,3,23,14,56,87,32,43,98,64,234,656,75,33,43,6,78,11,22,4,66,76};
        input = solution(input);
        for(int i: input){
            System.out.println(i);
        }
    }
}
