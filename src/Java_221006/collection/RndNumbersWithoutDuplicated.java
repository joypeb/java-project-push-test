package Java_221006.collection;

import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> dup = randomNumberGenerator.getGenerateDuplicated();
        Set<Character> dupAlphabet = randomNumberGenerator.getDupAlphabet();
/*
        for(int i=0; i<50; i++) {
            randomNumberGenerator.generateDuplicated(50);
        }

        for(int d : dup) {
            System.out.println(d);
        }
     */

        for(int i=0; i<100; i++) {
            randomNumberGenerator.generateAlphabet();
        }

        for(char c : dupAlphabet) {
            System.out.println(c);
        }
    }
}
