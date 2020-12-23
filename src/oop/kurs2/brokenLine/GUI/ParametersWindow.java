package oop.kurs2.brokenLine.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParametersWindow extends JFrame {

    private JPanel contentPane;
    private JButton drawButton;
    private JTextField amountPoints;
    private JTextField brokenLineWeight;
    private JTextField brokenLineHeight;
    DrawPanel drawPanel = DrawPanel.getDrawPanel();
    private static ParametersWindow parametersWindow;

    public ParametersWindow() {
        parametersWindow = this;
        amountPoints.setText("20");
        brokenLineWeight.setText("200");
        brokenLineHeight.setText("200");
        setContentPane(contentPane);
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setAmountPoints(Integer.parseInt(amountPoints.getText()));
                drawPanel.setBrokenLineWidth(Integer.parseInt(brokenLineWeight.getText()));
                drawPanel.setBrokenLineHeight(Integer.parseInt(brokenLineHeight.getText()));

               drawPanel.repaint();
            }
        });
    }

    public JTextField getAmountPoints() {
        System.out.println(amountPoints.getText());
        return amountPoints;
    }

    public JTextField getBrokenLineWeight() {
        return brokenLineWeight;
    }

    public JTextField getBrokenLineHeight() {
        return brokenLineHeight;
    }

    public static ParametersWindow getParametersWindow() {
        return parametersWindow;
    }
}
