package CodeUp;

import java.util.Scanner;

public class CodeUp_1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=num-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
