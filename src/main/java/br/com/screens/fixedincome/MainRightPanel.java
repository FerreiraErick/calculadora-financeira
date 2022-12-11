package br.com.screens.fixedincome;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MainRightPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public MainRightPanel(JFrame mainRendaFixa) {
		setup(mainRendaFixa);
		setPanelLayout();
		mainRendaFixa.add(this);
	}

	private void setPanelLayout() {
		setLayout(new GridLayout(2, 0));
		
	}

	private void setup(JFrame jFrame) {
		setBorder(new LineBorder(Color.black));
		setLayout(new GridLayout(2, 0));
		setSize((int) Math.round(jFrame.getWidth() * 0.67), jFrame.getHeight());
		setBackground(Color.blue);
		setAlignmentX(JPanel.RIGHT_ALIGNMENT);
		setVisible(true);
	}
	

}
