package br.com.calculadora.home;

import br.com.calculadora.components.CustomFrame;
import br.com.calculadora.infrastructure.ScreenPool;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Home extends JFrame {

	public Home() {

		setup();

		MenuBar menuBar = new MenuBar();
		setJMenuBar(menuBar);

		JPanel mainPanel = new JPanel(null);
		mainPanel.setVisible(true);

		for (EnumOperacoes op : EnumOperacoes.values()){
			add(createOpButton(op));
		}

		add(mainPanel);
		setVisible(true);
	}

	private void setup() {
		setSize(new Dimension(480, 320));
		setTitle("Simulador Financeiro");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		ScreenPool.setScreen(this.getClass().getName(), this);
	}

	private JButton createOpButton(EnumOperacoes op) {
		var opButton = new JButton(op.getNome());
		opButton.addActionListener(
                e -> createOpInstance(op)
        );
		opButton.setActionCommand("Test");
		return opButton;
	}

	private static void createOpInstance(EnumOperacoes op) {
		try {
			op.getFrame().getConstructor().newInstance();
		} catch (NoSuchMethodException | InstantiationException | InvocationTargetException |
				 IllegalAccessException ex) {
			throw new RuntimeException(ex);
		}
	}

}
