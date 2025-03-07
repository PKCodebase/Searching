package com.search;
import java.util.Scanner;
public class IterationUseLinearSearch{

    public static int searchElement(int arr[],int num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]== num){
               return i;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int num = sc.nextInt();
        int result = searchElement(arr,num);
        System.out.println(result);


        if (result == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}


//Time = O(n)
//Space = O(1)
