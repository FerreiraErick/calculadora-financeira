package br.com.calculadora.screens.components;

import org.jfree.chart.JFreeChart;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.IntStream;

public class ComboBoxWithLabel extends JPanel implements  GetFieldContent<Integer>{

    private JLabel label;
    private JComboBox<?> comboBox;

    public ComboBoxWithLabel(String labelName, List<Integer> range) {
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);
        label = new JLabel(labelName);
        comboBox = new JComboBox<>(range.toArray());
        comboBox.setMaximumRowCount(120);

        add(label);
        add(Box.createHorizontalStrut(100));
        add(comboBox);

        setBorder(BorderFactory.createEmptyBorder(0,0,10,0));

        setVisible(true);
    }
    @Override
    public Integer getFieldContent() {
        return (Integer) this.comboBox.getSelectedItem();
    }
}
