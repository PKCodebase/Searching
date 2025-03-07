package com.search;

public class IterationUseBinarySearch {

    public static int binarySearch(int arr[],int num){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(num == arr[mid]){
                return mid;
            }else if(num<arr[mid]){
                end =  mid -1;
            }else if(num>arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num = 5;
        int result = binarySearch(arr,num);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}

// Time = O(log n)  //Because it all divide array in two part
//Space = O(1)

//Binary serach only use for sorted element
