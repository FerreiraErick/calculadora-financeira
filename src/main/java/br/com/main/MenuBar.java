package br.com.main;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenu menu;
	
	public MenuBar() {
		
		menu = new JMenu("dummie");
		add(menu);		
		
		createMenuItems();
		
		
		
		setVisible(true);
	}

	private void createMenuItems() {
		
		JMenuItem carregar = new JMenuItem("dummie 1");
		carregar.setVisible(true);
		
		this.menu.add(carregar);
		
	}

}
