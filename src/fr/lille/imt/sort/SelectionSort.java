/**
 * 选择排序
 */

package fr.lille.imt.sort;

public class SelectionSort {

    public static int[] solution(int[] array){
        for(int i =0;i<array.length;i++){
            int minIndex = i;
            for(int j = i;j<array.length;j++){
                if(array[j]<array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
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
