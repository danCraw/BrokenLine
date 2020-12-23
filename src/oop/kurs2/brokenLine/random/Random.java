package oop.kurs2.brokenLine.random;

public class Random {
    public int inBounds(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
