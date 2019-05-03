package fr.lille.imt.array;

public class RotatedBS {
    public static int search(int[] arr, int target){
        int start = 0, end = arr.length -1 , mid;
        while(start<end){
            mid = (start+end)/2;
            if(arr[mid] < arr[end])
                end = mid;
            else
                start = mid +1;
        }
        int rot = start;
        start = 0;end = arr.length-1;
        while(start<=end){
            mid = (start+end)/2;
            int realMid = (mid+rot)%arr.length;
            if(target == arr[realMid]) return realMid;
            if(target>arr[realMid]) start = mid+1;
            else end = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {4,5,6,0,1,2,3};
        int res = search(arr,5);
    }
}
