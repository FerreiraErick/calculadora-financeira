package br.com.screens.components;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

public class ComboBoxWithLabel extends JPanel implements  GetFieldContent<Integer>{

    private JLabel label;
    private JComboBox<?> comboBox;

    public ComboBoxWithLabel(String labelName) {
        GridLayout gridLayout = new GridLayout(1,2);
        gridLayout.setHgap(10);
        setLayout(gridLayout);

        label = new JLabel(labelName);
        comboBox = new JComboBox<>(IntStream.rangeClosed(1, 120).boxed().toArray());
        comboBox.setMaximumRowCount(120);


        add(label);
        add(comboBox);

        setBorder(BorderFactory.createEmptyBorder(0,0,10,0));

        setVisible(true);
    }
    @Override
    public Integer getFieldContent() {
        return (Integer) this.comboBox.getSelectedItem();
    }
}
