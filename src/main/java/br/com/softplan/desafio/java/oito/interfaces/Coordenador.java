package br.com.softplan.desafio.java.oito.interfaces;

public interface Coordenador {
	
	default void gerarRelatorio(){
		System.out.println("Relat�rio do coordenador");
	}
}
