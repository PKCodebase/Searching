package com.search;

public class FirstOccuranceUsingLinearSearch {

    public static int firstOccurance(int arr[],int num){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        int num = 5;

        int result = firstOccurance(arr,num);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
