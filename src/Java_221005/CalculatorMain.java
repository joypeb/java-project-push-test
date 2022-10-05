package Java_221005;

public class CalculatorMain {
    public static void main(String[] args) {

        int a = 10, b = 5;

        Calculator cal = new Calculator(a,b);


        System.out.println(a + " + " + b + " = " + cal.plus());
        System.out.println(a + " - " + b + " = " + cal.minus());
        System.out.println(a + " * " + b + " = " + cal.multiple());
        System.out.println(a + " / " + b + " = " + cal.divide());
    }
}
