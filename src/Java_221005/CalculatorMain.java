package Java_221005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int a = 10, b = 5;

        System.out.println(a + " + " + b + " = " + cal.plus(a,b));
        System.out.println(a + " - " + b + " = " + cal.minus(a,b));
        System.out.println(a + " * " + b + " = " + cal.multiple(a,b));
        System.out.println(a + " / " + b + " = " + cal.divide(a,b));
    }
}
