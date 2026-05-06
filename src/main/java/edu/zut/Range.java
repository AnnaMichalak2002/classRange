package edu.zut;

public class Range {
    private int min;
    private int max;

    public Range(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min cannot be greater than max");
        }
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(int number) {
        return number >= min && number <= max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}