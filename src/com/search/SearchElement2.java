package com.search;

public class SearchElement2 {
    public static int searchElement(int arr[],int num,int size){

        if(num==arr[size-1]){
            return size-1;
        }

        return searchElement(arr, num, size-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num = 5;
        int size = arr.length;
        int result = searchElement(arr,num,size);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
