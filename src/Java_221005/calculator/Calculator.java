package Java_221005.calculator;

public class Calculator {
    NumberGenerator numG;

    public Calculator(NumberGenerator numG) {
        this.numG = numG;
    }

    public void plus() {
        System.out.println(10 + numG.generate(10));
    }
}
