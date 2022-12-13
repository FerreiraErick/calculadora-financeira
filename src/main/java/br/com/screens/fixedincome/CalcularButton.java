package br.com.screens.fixedincome;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcularButton extends JButton {
	private static final long serialVersionUID = 1L;
	public CalcularButton(JPanel jframe) {
		super("Calcular");
		setup(jframe);
		jframe.add(this);
	}

	private void setup(JPanel jframe) {
		setVisible(true);
	}
}
