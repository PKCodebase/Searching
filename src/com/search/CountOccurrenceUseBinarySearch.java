package com.search;

public class CountOccurrenceUseBinarySearch {
    public static int firstOccurrence(int arr[], int num, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] < arr[mid]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int lastOccurrence(int arr[], int num, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] < arr[mid + 1]) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int countOccurrence(int arr[], int num, int start, int end) {
        int first = firstOccurrence(arr, num, start, end);
        if (first == -1) {
            return 0;
        }
        int last = lastOccurrence(arr, num, start, end);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 40, 60, 70, 80, 80};
        int num = 80;
        int start = 0;
        int end = arr.length - 1;

        int count = countOccurrence(arr, num, start, end);
        System.out.println("Occurrences of " + num + ": " + count);

        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println(num + " appears " + count + " times in the array.");
        }
    }
}

//Time : O(log n)
//Space : O(1)
