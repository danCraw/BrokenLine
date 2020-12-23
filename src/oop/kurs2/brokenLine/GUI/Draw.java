package oop.kurs2.brokenLine.GUI;

import oop.kurs2.brokenLine.models.Point;

import java.awt.*;
import java.util.ArrayList;

public class Draw {
    void lines(Graphics g, ArrayList<oop.kurs2.brokenLine.models.Point> points) {
        g.setColor(Color.black);
        for (int i = 0; i < points.size() - 1; i++) {
            g.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i + 1).getX(), points.get(i + 1).getY());
        }
    }

    void allPoints(Graphics g, ArrayList<oop.kurs2.brokenLine.models.Point> pointsList, int pointSize) {
        g.setColor(Color.black);
        for (Point point : pointsList) {
            point(g, point.getX(), point.getY(), pointSize);
        }
    }

    private void point(Graphics g, int x, int y, int pointSize) {
        g.fillOval(x - pointSize / 2, y - pointSize / 2, pointSize, pointSize);
    }

    void background(Graphics g, int width, int height) {
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
    }

}
