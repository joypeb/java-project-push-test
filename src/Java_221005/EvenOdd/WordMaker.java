package Java_221005.EvenOdd;

public interface WordMaker {
    String wordMaker(int num1, int num2);

    default String evenOddMaker(int num) {
        if(num % 2 == 0) {
            return "짝수";
        }
        else{
            return "홀수";
        }
    }
}
