package com.search;

public class CountOccuranceUseLinearSearch {
    public static int countOccurance(int arr[],int num) {
      int temp = 0;
              int n = arr.length;
      for(int i=0;i<n;i++){
          if(arr[i] == num)
          temp++;
      }
      return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        int num = 7;

        int result = countOccurance(arr,num);
        System.out.println(result);
        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
