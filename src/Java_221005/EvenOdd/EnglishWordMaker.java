package Java_221005.EvenOdd;

public class EnglishWordMaker implements WordMaker{
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
