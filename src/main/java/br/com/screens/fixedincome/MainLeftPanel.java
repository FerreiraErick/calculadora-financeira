package br.com.screens.fixedincome;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainLeftPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MainLeftPanel(JFrame jFrame) {
		setup(jFrame);
		jFrame.add(this);
	}

	private void setup(JFrame jFrame) {
		setSize((int) Math.round(jFrame.getWidth() * 0.32), jFrame.getHeight());
		setBackground(Color.red);
		setAlignmentX(JPanel.LEFT_ALIGNMENT);
		setVisible(true);
	}
	

}
