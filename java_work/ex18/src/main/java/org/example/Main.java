package org.example;

public class Main {
    public static void main(String[] args) {

    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }

    public static void addOneDArr(int[] arr, int add){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr,int add){
        for (int i = 0; i < arr.length; i++) {
            addOneDArr(arr[i],add);
        }


    }

}