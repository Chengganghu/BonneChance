package fr.lille.imt.sort;

public class HeapSortReviser2 {


    public static void adjustHeap(int[] arr,int target,int maxIndex){
        int i=target,j;
        while(i*2+1<maxIndex){
            j=i*2+1;
            if(arr[i*2+1]<arr[i*2+2]){
                j=i*2+2;
            }
            if(arr[i]>arr[j])
                break;
            swap(arr,i,j);
            i=j;
        }
    }

    public static void swap(int[]arr,int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
