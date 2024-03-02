package br.com.calculadora.fixedincome;

import javax.swing.*;
import java.awt.*;

public class IncomesTable extends JTable {

    private JPanel tablePane;

    public IncomesTable(JPanel jPanel) {
        setTable();
        setup(jPanel);
        jPanel.add(this);
    }

    private void setTable() {
        var table = new JTable(3,  3);
        table.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        table.setVisible(true);

        tablePane = new JPanel();
        tablePane.add(table);
        tablePane.setVisible(true);

        add(tablePane);
    }

    private void setup(JPanel jPanel){
        setSize(200, 100);
        setLayout(new GridLayout());
        setVisible(true);
    }
}
