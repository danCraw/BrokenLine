package oop.kurs2.brokenLine.GUI;

import oop.kurs2.brokenLine.random.Random;
import oop.kurs2.brokenLine.comparator.PointsYComparator;
import oop.kurs2.brokenLine.models.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private ParametersWindow parametersWindow = ParametersWindow.getParametersWindow();
    private static DrawPanel drawPanel;
    private Draw draw = new Draw();
    private Random random = new Random();

    private int pointSize = 10;
    private int brokenLineWidth = 200;
    private int brokenLineHeight = 200;
    private int amountPoints = 10;

    private PointsYComparator pointsYComparator =  new PointsYComparator();
    private ArrayList<Point> points = new ArrayList<Point>();
    private int startX;
    private int startY;

    DrawPanel(){
        drawPanel = this;
    }

    @Override
    public void paint(Graphics g) {
        points.clear();

        startX = random.inBounds(0, getWidth() - brokenLineWidth);
        startY = random.inBounds(0, getHeight() - brokenLineHeight);

        draw.background(g, getWidth(), getHeight());
        initPoints();
        points.sort(pointsYComparator);
        draw.lines(g, points);
        draw.allPoints(g, points, pointSize);
    }

    private void initPoints() {
        for (int i = 0; i < amountPoints; i++) {
            points.add(new Point(random.inBounds(startX, startX + brokenLineWidth),
                                 random.inBounds(startY, startY + brokenLineHeight)));
        }
    }

    public static DrawPanel getDrawPanel() {
        return drawPanel;
    }

    public void setBrokenLineWidth(int brokenLineWidth) {
        this.brokenLineWidth = brokenLineWidth;
    }

    public void setBrokenLineHeight(int brokenLineHeight) {
        this.brokenLineHeight = brokenLineHeight;
    }

    public void setAmountPoints(int amountPoints) {
        this.amountPoints = amountPoints;
    }
}
