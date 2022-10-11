package Java_221011.codeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class digitTest {
    public int soultion(int n) {
        ArrayList<Integer> ar = new ArrayList();
        int result = 0;

        while(n>0) {
            int r = n%10;
            ar.add(r);
            n/=10;
        }

        for(int re : ar) {
            result += re;
        }

        return result;
    }

    public static void main(String[] args) {
        digitTest dt = new digitTest();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(dt.soultion(num));
    }
}
