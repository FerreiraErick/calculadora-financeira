package br.com.calculadora.screens.fixedincome;

import br.com.calculadora.screens.components.CustomFrame;
import br.com.calculadora.screens.home.Home;
import br.com.calculadora.screens.infrastructure.ScreenPool;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MainFixedIncome extends JFrame implements CustomFrame {
	
	public MainFixedIncome() {
		setup();
		setMainPanel();
	}
	
	private void setMainPanel() {
		new MainLeftPanel(this);
		new MainRightPanel(this);
	}

	public void setup() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) (screenSize.getWidth() / 2);
		int width = (int) (screenSize.getHeight() / 2);
		setBounds(width, height, 800, 600);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		addWindowListener(windowListener());
	}
	

	@Override
	public WindowAdapter windowListener() {
		return new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ScreenPool.getScreen(Home.class.getName()).setVisible(true);
			}
		};
	}

}
