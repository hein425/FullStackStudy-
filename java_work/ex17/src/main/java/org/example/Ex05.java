package org.example;
/*
어제자 1번문제 선생님 풀이
 */
public class Ex05 {

    public static void main(String[] args) {
        int[] arr = {10,20,5,9,35,100};

        System.out.println("최소값= " +minValue(arr));
        System.out.println("최대값= " +maxValue(arr));
    }

    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int temp:arr){
            if(max < temp)
                max = temp;
        }

        return max;
    }



}
