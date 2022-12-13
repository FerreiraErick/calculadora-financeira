package br.com.screens.home;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.screens.fixedincome.MainFixedIncome;
import br.com.screens.infrastructure.ScreenPool;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;

	private OperationTypeComboBox tipoOperacaoComboBox;
	private JButton btnSimular;

	public Home() {

		setup();

		// menu bar
		MenuBar menuBar = new MenuBar();
		setJMenuBar(menuBar);

		tipoOperacaoComboBox = new OperationTypeComboBox();
		tipoOperacaoComboBox.setBounds(150, 100, 200, 20);
		tipoOperacaoComboBox.setAlignmentX(CENTER_ALIGNMENT);

		btnSimular = new JButton("Simular");
		btnSimular.setBounds(200, 160, 100, 20);
		btnSimular.setVisible(true);
		btnSimular.addActionListener(this.onClickBtnSimular());

		JPanel mainPanel = new JPanel(null);

		mainPanel.setVisible(true);

		mainPanel.add(tipoOperacaoComboBox);
		mainPanel.add(btnSimular);

		add(mainPanel);
		setVisible(true);
	}

	public void setup() {
		setSize(new Dimension(480, 320));
		setTitle("Simulador Financeiro");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		ScreenPool.setScreen(this.getClass().getName(), this);
	}

	private ActionListener onClickBtnSimular() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String tipoOperacao = tipoOperacaoComboBox.getSelectedItem().toString();

				switch (EnumOperacoes.getEnumByName(tipoOperacao)) {
				case FINACIAMENTO_IMOBILIARIO:
					System.out.println("Financiamento imobiliario");
					break;
				case JUROS_RENDA_FIXA:
					setVisible(false);
					new MainFixedIncome();
					break;
				default:
					break;
				}
			}
		};
	}

}
