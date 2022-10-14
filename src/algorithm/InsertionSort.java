package algorithm;

import java.util.Arrays;

public class InsertionSort {
    private int[] solution(int[] arr) {

        for(int i=1; i<arr.length; i++) {
            for(int j=i-1; j>i; j--) {

            }
        }


        return arr;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {3,44,2,63,8,1};

        int[] result = insertionSort.solution(arr);

        System.out.println(Arrays.toString(result));
    }
}
