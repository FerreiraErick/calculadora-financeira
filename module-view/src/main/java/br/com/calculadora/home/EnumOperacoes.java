package br.com.calculadora.home;

import br.com.calculadora.fixedincome.MainFixedIncome;

import java.util.Arrays;
import java.util.stream.Stream;

public enum EnumOperacoes {

	JUROS_RENDA_FIXA("Juros de Renda Fixa", MainFixedIncome.class),
	FINACIAMENTO_IMOBILIARIO("Finaciamento Imobiliário", null);

	private String nome;
	private Class<?> frameClass;

	private EnumOperacoes(String nome, Class<?> customFrame) {
		this.nome = nome;
		this.frameClass = customFrame;
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

	public Class<?> getFrameClass() {
		return frameClass;
	}

}
