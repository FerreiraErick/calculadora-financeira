package br.com.calculadora.screens.fixedincome;

import javax.swing.*;

public class CalcularButton extends JButton {

	public CalcularButton(JPanel jFrame) {
		super("Calcular");
		setup(jFrame);
		jFrame.add(this);
	}

	private void setup(JPanel jFrame) {
		setVisible(true);
	}
}
