package Java_221005.EvenOdd;

public class Main {
    public static void main(String[] args) {
        WordMaker KwordMaker = new KoreanWordMaker();
        WordMaker EwordMaker = new EnglishWordMaker();

        PrintWord KoreanWord = new PrintWord(KwordMaker);
        PrintWord EnglishWord = new PrintWord(EwordMaker);

        KoreanWord.printLangWord(10,2);
        EnglishWord.printLangWord(11,2);
    }
}
