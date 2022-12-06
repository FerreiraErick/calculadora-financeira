package br.com.screens.home;

import javax.swing.JComboBox;

public class TipoOperacaoComboBox extends JComboBox<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoOperacaoComboBox() {
		super(EnumOperacoes.getValuesNames());
		configure();
		
	}
	
	private void configure() {
		setVisible(true);
	}

}
