package br.com.screens.fixedincome;

import br.com.screens.components.ComboBoxWithLabel;
import br.com.screens.components.TextFieldWithLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FieldTaxesPanel extends JPanel {

    private static final int DEFAULT_TEXT_FIELD_SIZE = 10;
    private TextFieldWithLabel incomeTax;
    private TextFieldWithLabel startAmount;
    private TextFieldWithLabel monthlyAmount;
    private TextFieldWithLabel discountTaxes;
    private ComboBoxWithLabel investingTime;
    private CalcularButton calcularButton;

    public FieldTaxesPanel(JPanel jPanel) {
        setup(jPanel);
        setFields();
        setListeners();
        jPanel.add(this);
    }

    private void setListeners() {
        calcularButton.addActionListener(calcularEvent);
    }

    private void setup(JPanel jPanel) {
        setSize(jPanel.getWidth(), jPanel.getHeight() - 200);
        setLayout(new GridLayout(6, 1));
        setVisible(true);
    }

    private void setFields(){
        incomeTax = new TextFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Taxa de Juros (%)");
        startAmount = new TextFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Valor inicial (R$)");
        monthlyAmount = new TextFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Aporte mensal (R$)");
        discountTaxes = new TextFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Taxa de desconto (%)");
        investingTime = new ComboBoxWithLabel("Tempo de investimento");
        calcularButton = new CalcularButton(this);

        add(incomeTax);
        add(startAmount);
        add(monthlyAmount);
        add(discountTaxes);
        add(investingTime);
        add(calcularButton);
    }

    private final ActionListener calcularEvent = event -> {
        // TODO: Call calculate incomes service here
        System.out.println(investingTime.getFieldContent());
        System.out.println(incomeTax.getFieldContent());

    };

}
