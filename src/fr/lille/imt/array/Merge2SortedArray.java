package fr.lille.imt.array;

public class Merge2SortedArray {
    public static void solution(int[] nums1,int m,int[] nums2,int n){
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0) {
            if(nums1[i]>nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while(j>=0)
            nums1[k--] = nums2[j--];
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,3,6};
        solution(array1,3,array2,3);
    }
}
