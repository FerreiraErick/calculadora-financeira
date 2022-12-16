package br.com.screens.components;

import javax.swing.*;
import java.awt.*;

public class TextFieldWithLabel extends JPanel implements GetFieldContent<String>{

    private JLabel label;
    private JTextField textField;

    public TextFieldWithLabel(int fieldSize, String labelName) {
        GridLayout gridLayout = new GridLayout(1,2);
        gridLayout.setHgap(10);
        setLayout(gridLayout);

        label = new JLabel(labelName);
        textField = new JTextField(fieldSize);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        add(label);
        add(textField);

        setBorder(BorderFactory.createEmptyBorder(0,0,10,0));

        setVisible(true);
    }

    @Override
    public String getFieldContent() {
        return textField.getText();
    }
}
