package Java_221005;

public class CalculatorMain {
    public static void main(String[] args) {

        int a = 10, b = 5;

        RandomNumberCreater ranN = new RandomNumberCreater();
        Calculator cal = new Calculator(a,b);
        RandomCalculator rCal = new RandomCalculator(a, ranN);

        System.out.println("일반 숫자");
        System.out.println(a + " + " + b + " = " + cal.plus());
        System.out.println(a + " - " + b + " = " + cal.minus());
        System.out.println(a + " * " + b + " = " + cal.multiple());
        System.out.println(a + " / " + b + " = " + cal.divide());

        System.out.println("랜덤 숫자");
        System.out.println(a + " + " + rCal.getB() + " = " + rCal.plus());
        System.out.println(a + " - " + rCal.getB() + " = " + rCal.minus());
        System.out.println(a + " * " + rCal.getB() + " = " + rCal.multiple());
        System.out.println(a + " / " + rCal.getB() + " = " + rCal.divide());
    }
}
