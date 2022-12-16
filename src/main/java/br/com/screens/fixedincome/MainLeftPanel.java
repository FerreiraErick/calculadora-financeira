package br.com.screens.fixedincome;

import java.awt.*;

import javax.swing.*;

public class MainLeftPanel extends JPanel {
	
	public MainLeftPanel(JFrame jFrame) {
		setup(jFrame);
		setBody();
		jFrame.add(this);
	}

	private void setup(JFrame jFrame) {
		setSize((int) Math.round(jFrame.getWidth() * 0.45), jFrame.getHeight());
		setVisible(true);
	}
	
	private void setBody() {
		new FieldTaxesPanel(this);
	}

}
