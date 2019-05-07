package fr.lille.imt.sort;

public class HeapSort {


    public static void buildMaxHeap(int[] array){
        for(int i=(array.length-2)/2;i>=0;i--){
            adjustHeap(array,array.length-1,i);
        }
    }


    public static void adjustHeap(int[] array, int m,int s){
        int maxIndex = m;
        int i = s, j;
        int tmp = array[s];
        while(2*i+1<=maxIndex){
            j = 2*i+1;
            if(j<maxIndex && array[j]<array[j+1])
                j = j+1;
            if(array[i]>array[j])
                break;
            swap(array,i,j);
            i = j;
        }

    }

    public static void swap(int[] arr,int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void heapSort(int [] arr){
        buildMaxHeap(arr);
        for(int i = arr.length-1;i>=0;i--){
            swap(arr,i,0);
            adjustHeap(arr,i-1,0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,4,8,2};
        heapSort(arr);
    }
}
