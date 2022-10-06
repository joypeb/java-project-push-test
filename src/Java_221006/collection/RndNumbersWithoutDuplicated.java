package Java_221006.collection;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i=0; i<50; i++) {
            randomNumberGenerator.generate(10);
        }
    }
}
