package br.com.screens.fixedincome;

import java.awt.*;
import java.io.Serial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MainRightPanel extends JPanel{

	@Serial
	private static final long serialVersionUID = 1L;
	
	public MainRightPanel(JFrame mainFixedIncome) {
		setup(mainFixedIncome);
		setPanelLayout();
		setBody();
		mainFixedIncome.add(this);
	}

	private void setPanelLayout() {
		setLayout(new FlowLayout());
	}

	private void setBody(){
		new IncomesTable(this);
	}

	private void setup(JFrame jFrame) {
		setLayout(new GridLayout(2, 0));
		setSize((int) Math.round(jFrame.getWidth() * 0.67), jFrame.getHeight());
		setAlignmentX(JPanel.RIGHT_ALIGNMENT);
		setVisible(true);
	}
	

}
