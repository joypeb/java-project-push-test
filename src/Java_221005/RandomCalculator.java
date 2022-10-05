package Java_221005;


public class RandomCalculator {
    RandomNumberCreater ranN = new RandomNumberCreater();
    private int a;
    private int b = ranN.randomNumCreater();

    public RandomCalculator(int a) {
        this.a = a;
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
