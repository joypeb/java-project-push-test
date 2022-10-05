package Java_221005.EvenOdd;

public class PrintWord {
    WordMaker wordmaker;

    public PrintWord(WordMaker wordmaker) {
        this.wordmaker = wordmaker;
    }

    void printLangWord(int num1, int num2) {
        System.out.println(wordmaker.evenOddMaker(num1) + "+" + wordmaker.evenOddMaker(num2) + "="
                + wordmaker.evenOddMaker(num1+num2));
    }
}
