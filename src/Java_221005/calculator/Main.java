package Java_221005.calculator;

public class Main {
    public static void main(String[] args) {
        //여기서 관계를 맺어준다
        NumberGenerator specificNumberGenerator = new SpecificNumberGenerator();
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Calculator specificCal = new Calculator(specificNumberGenerator);
        Calculator randomCal = new Calculator(randomNumberGenerator);
        specificCal.plus();
        randomCal.plus();
    }
}
