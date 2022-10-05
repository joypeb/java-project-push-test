package Java_221005.calculator2;

public class Calculator {
    NumberCreator numberCreator;
    private int baseNum = 10;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = 10;
    }

    public Calculator(NumberCreator numberCreatm, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    void plus(int num) {
        System.out.println(num + numberCreator.create(10));
    }
}
