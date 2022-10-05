package Java_221005;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int plus() {
        return a+b;
    }

    int minus() {
        return a-b;
    }

    double multiple() {
        return (double) a*b;
    }

    double divide() {
        return (double) a/b;
    }
}
