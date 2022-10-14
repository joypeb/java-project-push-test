package algorithm;

import java.util.Arrays;

public class InsertionSort {
    private int[] solution(int[] arr) {
        int i = 1;
        int temp = 0;
        if(arr[i] < arr[i-1]) {
            temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = {333,44,2,63,8,1};

        int[] result = insertionSort.solution(arr);

        System.out.println(Arrays.toString(result));
    }
}
