import java.util.Scanner;

public class CodeUp_1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String numStr = num1%2 == 0 ? "짝수" : "홀수";
        String numStr2 = num2%2 == 0 ? "짝수" : "홀수";
        String result = (num1+num2)%2 == 0 ? "짝수" : "홀수";
        System.out.printf("%s+%s = %s\n", numStr, numStr2, result);
    }
}
