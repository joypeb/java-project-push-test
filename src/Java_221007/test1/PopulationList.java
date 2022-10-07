package Java_221007.test1;

import java.util.Arrays;

public class PopulationList {
    private int moveInCity;
    private int moveOutCity;

    public PopulationList(int moveInCity, int moveOutCity) {
        this.moveInCity = moveInCity;
        this.moveOutCity = moveOutCity;
    }

    public int getMoveInCity() {
        return moveInCity;
    }

    public int getMoveOutCity() {
        return moveOutCity;
    }
}
