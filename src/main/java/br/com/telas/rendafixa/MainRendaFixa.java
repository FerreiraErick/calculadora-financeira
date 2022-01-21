package br.com.telas.rendafixa;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import br.com.telas.CustomFrame;
import br.com.telas.main.MainScreen;

public class MainRendaFixa extends JFrame implements CustomFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainScreen mainScreen;
	public MainRendaFixa(MainScreen mainScreen) {
		// TODO Auto-generated constructor stub
		this.mainScreen = mainScreen;
		configure();
	
	}

	@Override
	public void configure() {
		
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
