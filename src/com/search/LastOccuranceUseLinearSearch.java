package com.search;

public class LastOccuranceUseLinearSearch {
    public static int lastOcuurance(int arr[],int num){

        int n = arr.length-1;
        for(int i= n;i>=0;i--){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        int num = 8;

        int result = lastOcuurance(arr,num);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}

//Time:O(n)
//Space:O(1)
