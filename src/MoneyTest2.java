import java.util.Scanner;

public class MoneyTest2 {
    public static void main(String[] args) {
        int m1 = 50000;
        int m2 = 10000;
        int m3 = 5000;
        int m4 = 1000;
        int m5 = 500;
        int m6 = 100;
        int m7 = 50;
        int m8 = 10;

        int refund = 555350;

        //step2

        System.out.println("50000원 : " + refund/m1);
        refund%=50000;
        System.out.println("10000원 : " + refund/m2);
        refund%=10000;
        System.out.println("5000원 : " + refund/m3);
        refund%=5000;
        System.out.println("1000원 : " + refund/m4);
        refund%=1000;
        System.out.println("500원 : " + refund/m5);
        refund%=500;
        System.out.println("100원 : " + refund/m6);
        refund%=100;
        System.out.println("50원 : " + refund/m7);
        refund%=50;
        System.out.println("10원 : " + refund/m8);
        refund%=10;
        System.out.println("남은돈 : " + refund);
    }
}
