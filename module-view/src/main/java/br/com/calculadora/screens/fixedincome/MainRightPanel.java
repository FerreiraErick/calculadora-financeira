package br.com.calculadora.screens.fixedincome;

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
		setBody();
		mainFixedIncome.add(this);
	}


	private void setBody(){
		new IncomesTable(this);
	}

	private void setup(JFrame jFrame) {
		setLayout(new GridLayout(2, 1));
		setVisible(true);
	}

}
