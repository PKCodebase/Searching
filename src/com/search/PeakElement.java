package com.search;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end=nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        int result = findPeakElement(arr);
        System.out.println(result);
    }


}
