package br.com.calculadora.fixedincome;

import javax.swing.*;

public class CalcularButton extends JButton {

	public CalcularButton(JComponent jFrame) {
		super("Calcular");
		setup(jFrame);
		jFrame.add(this);
	}

	private void setup(JComponent jFrame) {
		setVisible(true);
	}
}
