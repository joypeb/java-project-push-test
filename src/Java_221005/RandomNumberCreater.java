package Java_221005;

public class RandomNumberCreater implements NumberCreater{
    @Override
    public int randomNumCreater() {
        return (int)(Math.random() * 10);
    }
}
