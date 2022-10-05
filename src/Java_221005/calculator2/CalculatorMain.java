package Java_221005.calculator2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumerCreator());
        calculator.plus(10);

    }
}
