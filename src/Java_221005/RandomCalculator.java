package Java_221005;


public class RandomCalculator {
    private NumberCreater numberCreater;
    private int a;
    private int b;

    public RandomCalculator(int a, NumberCreater numberCreater) {
        this.a = a;
        this.b = numberCreater.randomNumCreater();
    }

    int getB() {
        return this.b;
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
        try {
            return (double) a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
