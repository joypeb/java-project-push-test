package Java_221005.EvenOdd;

public class EnglishWordMaker implements WordMaker{
    @Override
    public String wordMaker(int num1, int num2) {
        String num1Str, num2Str, resultStr;
        num1Str = this.evenOddMaker(num1);
        num2Str = this.evenOddMaker(num2);
        resultStr = this.evenOddMaker(num1+num2);
        return num1Str + " + " + num2Str + " = " + resultStr;
    }

    @Override
    public String evenOddMaker(int num) {
        if(num % 2 == 0) {
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
