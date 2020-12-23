package oop.kurs2.brokenLine.comparator;

import oop.kurs2.brokenLine.models.Point;

import java.util.Comparator;

public class PointsYComparator implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2) {
        return Integer.compare(p1.getY(), p2.getY());
    }
}
