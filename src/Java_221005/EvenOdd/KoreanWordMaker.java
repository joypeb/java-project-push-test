package Java_221005.EvenOdd;

public class KoreanWordMaker implements WordMaker {
    @Override
    public String wordMaker(int num1, int num2) {
        String num1Str, num2Str, resultStr;
        num1Str = evenOddMaker(num1);
        num2Str = evenOddMaker(num2);
        resultStr = evenOddMaker(num1+num2);
        return num1Str + " + " + num2Str + " = " + resultStr;
    }
}
