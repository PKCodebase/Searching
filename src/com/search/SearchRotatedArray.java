package com.search;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int start = 0,end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<= target && target < nums[mid]){
                    end = mid-1;
                }else{
                    start= mid +1;
                }
            }
            else{
                if(nums[mid]<target && target <= nums[end]){
                    start = mid +1;

                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchRotatedArray searchRotatedArray = new SearchRotatedArray();
        int arr[] = {4,5,6,7,0,1,2};
        int result = searchRotatedArray.search(arr, 0);
        System.out.println(result);
    }
}
