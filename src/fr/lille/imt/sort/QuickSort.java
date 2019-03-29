package fr.lille.imt.sort;

public class QuickSort {

    public static int devide(int[]arr,int start, int end){
        int base = arr[end];
        while(start < end){

            while(start<end && arr[start]<=base)
                start++;
            if(start<end){
                swap(arr,start,end);
                end--;
            }
            while(start<end && arr[end]>=base)
                end--;
            if(start<end){
                swap(arr,start,end);
                start++;
            }
        }
        return start;
    }

    public static void sort(int[]arr,int start,int end){
        if(start > end ) return ;
        else{
            int partition = devide(arr,start,end);
            sort(arr,start,partition-1);
            sort(arr,partition+1,end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,8,11,25,15,9,7,10};
        sort(arr,0,arr.length-1);
    }

    public static void swap(int[]arr, int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
