package fr.lille.imt.sort;

public class MergeSortReviser {

    public static void merge(int[] arr1,int [] arr2){
        int length = arr1.length + arr2.length ;
        int [] res = new int[length];
        for(int i=0,j=0,index=0;index<length;index++){
            if(i>=arr1.length){
                res[index] = arr2[j++];
            }else if(j>=arr2.length){
                res[index] = arr1[i++];
            }
        }
    }
}
