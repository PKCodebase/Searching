package com.search;

public class RecursionUseBinarySearch {
    public static int binarySearch(int arr[],int num,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(num == arr[mid]){
            return mid;
        }else if(num<arr[mid]){
            end =  mid -1;
            return  binarySearch(arr, num, start, end);
        }else if(num>arr[mid]){
            start = mid + 1;
            return  binarySearch(arr, num, start, end);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num = 8;
        int start = 0;
        int end = arr.length-1;
        int result = binarySearch(arr,num,start,end);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}

// Time = O(log n)
//Space = O(log n)


