package br.com.softplan.desafio.java.oito.interfaces;

public interface Gerente {
	
	default void gerarRelatorio(){
		System.out.println("Relat�rio do Gerente");
	}
}
