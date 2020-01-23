package com.jung.algs;

public class InsertionSort {

    public static void printArray(int[] arr) {
        if (arr.length > 0) {
            for (int i : arr) {
                System.out.print(String.valueOf(i) + ',');
            }
        }
    }

    public static void iSort(int[] arr){
        if (arr.length == 0) { return; }
        int pos = 1;
        while (pos < arr.length) {
            int j=pos;
            for (int i=j-1; i >= 0; i--) {
                // bubble things up
                if (arr[j] < arr[i]) {
                    // basic swap
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    j--;
                }
            }
            pos++;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4,3,2,10,12,1,5,6};
        iSort(arr);
    }
}
