package Java_221005.calculator;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
