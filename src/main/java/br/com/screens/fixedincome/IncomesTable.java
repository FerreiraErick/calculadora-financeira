package br.com.screens.fixedincome;

import javax.swing.*;
import java.awt.*;

public class IncomesTable extends JTable {

    public IncomesTable(JPanel jPanel) {
        setup(jPanel);
        setTable();
        jPanel.add(this);
    }

    private void setTable() {
        var table = new JTable(3, 3);
        table.setVisible(true);
        add(table);
    }

    private void setup(JPanel jPanel){
        setSize((int) (jPanel.getWidth() * (0.9)), (jPanel.getHeight() / 2));
        setBackground(Color.green);
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
