package br.com.screens.fixedincome;

import javax.swing.*;
import java.awt.*;

public class IncomesTable extends JTable {

    public IncomesTable(JPanel jPanel) {
        setup(jPanel);
        jPanel.add(this);
    }

    private void setup(JPanel jPanel){
        setSize((int) (jPanel.getWidth() * (0.9)), (int) (jPanel.getHeight() / 2));
        setBackground(Color.green);
        setVisible(true);
    }
}
