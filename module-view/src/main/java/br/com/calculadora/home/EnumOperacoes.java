package br.com.calculadora.home;

import br.com.calculadora.components.CustomFrame;
import br.com.calculadora.fixedincome.MainFixedIncome;

import java.util.Arrays;
import java.util.stream.Stream;

public enum EnumOperacoes {

	JUROS_RENDA_FIXA(1, "Juros de Renda Fixa", MainFixedIncome.class),
	FINACIAMENTO_IMOBILIARIO(2, "Finaciamento Imobiliário", null);

	private Integer id;
	private String nome;
	private Class<?> frame;

	private EnumOperacoes(Integer id, String nome, Class<?> customFrame) {
		this.nome = nome;
		this.id = id;
		this.frame = customFrame;
	}

	public String getNome() {
		return nome;
	}

	public static String[] getValuesNames() {
		return Stream.of(values()).map((v) -> v.getNome()).toArray(String[]::new);
	}

	public static EnumOperacoes getEnumByName(String name) {
		return Arrays.asList(EnumOperacoes.values())
				.stream()
				.filter(e -> e.getNome().equalsIgnoreCase(name))
				.findAny()
				.get();
	}

	public Integer getId() {
		return id;
	}

	public Class<?> getFrame() {
		return frame;
	}

	public void setFrame(Class<?> frame) {
		this.frame = frame;
	}
}
