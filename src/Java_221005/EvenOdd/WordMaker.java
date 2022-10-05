package Java_221005.EvenOdd;

public interface WordMaker {
    default String evenOddMaker(int num) {
        if(num % 2 == 0) {
            return "짝수";
        }
        else{
            return "홀수";
        }
    }
}
