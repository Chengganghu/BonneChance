package fr.lille.imt.sort;

public class HeapSortReviser {

    public static void adjustHeap(int[]arr, int m,int t){
        int max = m;
        int tagert = arr[t];
        int i=0,j;
        while(i*2 + 1<= max){
            j = 2*i + 1;
            if(arr[2*i+1]<arr[2*i+2] && j<max){
                j = 2*i + 2;
            }
            if(tagert>arr[j])
                break;
            swap(arr,i,j);
            i = j;
        }

    }

    public static void buildHeap(int[]arr){
        for(int i=(arr.length-2)/2;i>=0;i--){
            adjustHeap(arr,arr.length-1,i);
        }
    }

    public static void sort(int[] arr){
        buildHeap(arr);
        for(int i=arr.length-1;i>=0;i--){
            swap(arr,0,i);
            adjustHeap(arr,i-1,0);
        }
    }

    public static void swap(int[] arr, int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static int leftChild(int[] arr,int index){
        index = 2*index + 1;
        return arr[index];
    }
}
