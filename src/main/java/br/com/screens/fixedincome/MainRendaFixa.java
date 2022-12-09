package br.com.screens.fixedincome;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import br.com.screens.components.CustomFrame;
import br.com.screens.home.Home;
import br.com.screens.infrastructure.ScreenPool;

public class MainRendaFixa extends JFrame implements CustomFrame {

	private static final long serialVersionUID = 1L;
	private Home mainScreen;
	public MainRendaFixa() {
		this.mainScreen = (Home) ScreenPool.getScreen(Home.class.getName());
		setup();
	}

	@Override
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
		// TODO Auto-generated method stub
		
		return new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				mainScreen.setVisible(true);
			}
		};
	}

}
