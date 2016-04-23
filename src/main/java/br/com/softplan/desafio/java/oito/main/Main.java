package br.com.softplan.desafio.java.oito.main;

import br.com.softplan.desafio.java.oito.classes.concretas.Colaborador;
import br.com.softplan.desafio.java.oito.interfaces.Coordenador;
import br.com.softplan.desafio.java.oito.interfaces.Supervisor;

public class Main {

	public static void main(String[] args) {

		Supervisor supervisor = new Colaborador();
		supervisor.gerarRelatorio();
		
		Coordenador coordenador2 = new Colaborador();
		coordenador2.gerarRelatorio();
	}

}
