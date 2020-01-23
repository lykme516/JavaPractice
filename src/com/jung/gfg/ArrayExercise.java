package com.jung.gfg;

class Student {
    public int roll_no;
    public String name;
    Student (int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayExercise {

    private static void printArr(int[] arr) {
        for (int i : arr){
            System.out.print(i);
        }
        System.out.print('\n');
    }

    public static void rotate(int[] arr, int k){
        int[] tmp = new int[arr.length];
        // tail, k to end, to beginning of tmp
        int head = 0;
        for (int i=k; i < arr.length; i++) {
            tmp[head] = arr[i];
            head++;
        }
        // apend start to k (not inclusive) to end
        for (int i=0; i<k; i++){
            tmp[head] = arr[i];
            head++;
        }
        printArr(tmp);
    }

    public static void main(String[] args) {
        int[] test = {1, 3, 5, 7, 9};
        rotate( test, 3);
    }

}
