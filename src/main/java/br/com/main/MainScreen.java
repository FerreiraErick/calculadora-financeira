package br.com.main;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainScreen(String title, Integer x, Integer y) {

		setSize(new Dimension(x, y));
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		MenuBar menuBar = new MenuBar();
		setJMenuBar(menuBar);
	
		setVisible(true);
	}



}
