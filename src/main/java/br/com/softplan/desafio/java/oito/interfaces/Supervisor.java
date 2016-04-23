package br.com.softplan.desafio.java.oito.interfaces;

public interface Supervisor extends Coordenador{
	
	default void gerarRelatorio(){
		System.out.println("Relatório do supervisor");
	}
}
