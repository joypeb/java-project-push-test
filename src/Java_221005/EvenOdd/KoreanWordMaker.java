package Java_221005.EvenOdd;

public class KoreanWordMaker implements WordMaker {
    @Override
    public String evenOddMaker(int num) {
        if(num % 2 == 0) {
            return "짝수";
        }
        else{
            return "홀수";
        }
    }
}
