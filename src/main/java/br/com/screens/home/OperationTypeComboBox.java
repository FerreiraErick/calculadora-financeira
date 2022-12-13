package br.com.screens.home;

import javax.swing.JComboBox;

public class OperationTypeComboBox extends JComboBox<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperationTypeComboBox() {
		super(EnumOperacoes.getValuesNames());
		configure();
		
	}
	
	private void configure() {
		setVisible(true);
	}

}
