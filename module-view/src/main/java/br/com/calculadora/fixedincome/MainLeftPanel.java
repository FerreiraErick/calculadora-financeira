package br.com.calculadora.fixedincome;

import javax.swing.*;

public class MainLeftPanel extends JPanel {

	private final FieldTaxesPanel fieldTaxesPanel = new FieldTaxesPanel(this);
	public MainLeftPanel(JFrame jFrame) {
		setup(jFrame);
		setBody();
		jFrame.add(this);
	}

	private void setup(JFrame jFrame) {
		setSize((int) Math.round(jFrame.getWidth() * 0.5), jFrame.getHeight());
		setVisible(true);
	}
	
	private void setBody() {

	}


}
