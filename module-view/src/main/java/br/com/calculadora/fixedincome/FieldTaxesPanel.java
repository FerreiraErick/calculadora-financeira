package br.com.calculadora.fixedincome;

import br.com.calculadora.controller.IncomeTaxesController;
import br.com.calculadora.domain.IncomeCalculateParameters;
import br.com.calculadora.components.ComboBoxWithLabel;
import br.com.calculadora.components.FloatFieldWithLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FieldTaxesPanel extends JComponent{

    private static final int DEFAULT_TEXT_FIELD_SIZE = 10;
    private FloatFieldWithLabel incomeTax;
    private FloatFieldWithLabel startAmount;
    private FloatFieldWithLabel monthlyAmount;
    private FloatFieldWithLabel discountTaxes;
    private ComboBoxWithLabel investingTime;
    private CalcularButton calcularButton;

    private final IncomeTaxesController incomeTaxesController = new IncomeTaxesController();

    public FieldTaxesPanel(JPanel jPanel) {
        setup(jPanel);
        setFields();
        setListeners();
        jPanel.add(this);
    }

    private void setListeners() {
        calcularButton.addActionListener(calculateEvent);
    }

    private void setup(JPanel jPanel) {
        setSize(jPanel.getWidth(), jPanel.getHeight() - 200);
        setLayout(new GridLayout(6, 1));
        setVisible(true);
    }

    private void setFields(){
        incomeTax = new FloatFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Taxa de Juros Anual (%)");
        startAmount = new FloatFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Valor inicial (R$)");
        monthlyAmount = new FloatFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Aporte mensal (R$)");
        discountTaxes = new FloatFieldWithLabel(DEFAULT_TEXT_FIELD_SIZE, "Taxa de desconto (%)");

        investingTime = new ComboBoxWithLabel("Tempo de investimento",
                IntStream.rangeClosed(1, 120).boxed().collect(Collectors.toList()));

        calcularButton = new CalcularButton(this);

        add(incomeTax);
        add(startAmount);
        add(monthlyAmount);
        add(discountTaxes);
        add(investingTime);
        add(calcularButton);
    }

    private final ActionListener calculateEvent = event -> {
        var response = incomeTaxesController.calculateTaxes(getParameters());
    };

    private IncomeCalculateParameters getParameters(){
        var parameters = new IncomeCalculateParameters();
        parameters.setIncomeTax(incomeTax.getFieldContent());
        parameters.setStartAmount(startAmount.getFieldContent());
        parameters.setMonthlyAmount(monthlyAmount.getFieldContent());
        parameters.setDiscountTaxes(discountTaxes.getFieldContent());
        parameters.setInvestingTime(investingTime.getFieldContent());
        return parameters;
    }
}
