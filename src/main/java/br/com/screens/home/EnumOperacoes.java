package br.com.screens.home;

import java.util.Arrays;
import java.util.stream.Stream;

public enum EnumOperacoes {

	JUROS_RENDA_FIXA(1, "Juros de Renda Fixa"), 
	FINACIAMENTO_IMOBILIARIO(2, "Finaciamento Imobiliário");

	private Integer id;
	private String nome;

	private EnumOperacoes(Integer id, String nome) {
		this.nome = nome;
		this.id = id;
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

}
