package oop.kurs2.brokenLine;

import oop.kurs2.brokenLine.GUI.MainWindow;
import oop.kurs2.brokenLine.GUI.ParametersWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        MainWindow window = new MainWindow();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        ParametersWindow parametersWindow = new ParametersWindow();
        parametersWindow.setSize(300, 200);
        parametersWindow.setVisible(true);
        parametersWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        parametersWindow.setLocation(790, 0);

    }
}
