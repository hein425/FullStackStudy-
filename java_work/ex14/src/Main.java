/*
배열 안에 숫자 세서 별찍는 문제 (어제거)
 */

import java.util.Arrays;

public class Main {
    Main() {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2, 5, 9};
        System.out.println(Arrays.toString(answer));
        int[] countNumber = {1, 2, 3, 4, 5, 9};
        int[] starNumber = new int[countNumber.length];

        for (int j = 0; j < countNumber.length; j++) {
            for (int i = 0; i < answer.length; i++) {
                if(countNumber[j]==answer[i]){
                starNumber[j] = starNumber[j]+1;
                }
            }
        }
        System.out.println(Arrays.toString(starNumber));
        for (int i = 0; i < starNumber.length; i++) {
            System.out.println((i+1)+":");
            for (int j = 0; j < starNumber[i]; j++) {
            System.out.print("*");
            }
            System.out.println();
        }

    }

    public void doPrint(int[] temp) {
        System.out.println("[");
        for (int i = 0; i < temp.length; i++) {
            if (temp.length == (i + 1)) {
                System.out.print(temp[i]);
            } else {
                System.out.print(temp[i] + ", ");
            }

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Main();
    }
}