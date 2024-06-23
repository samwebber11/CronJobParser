package models;

/** Define the max and min range of the data. */
public class Range {
    int minRange;
    int maxRange;

    public Range(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }
}
