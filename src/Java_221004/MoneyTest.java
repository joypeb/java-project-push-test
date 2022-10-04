package Java_221004;

import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean tf = true;
        int[] moneyArr = {50000,10000,5000,1000};
        int[] result = new int[4];

        for(int i=0; i<moneyArr.length; i++) {
            result[i] = num / moneyArr[i];
            num -= moneyArr[i]*result[i];
            System.out.println(moneyArr[i] + "는 " + result[i]);
        }

    }
}
