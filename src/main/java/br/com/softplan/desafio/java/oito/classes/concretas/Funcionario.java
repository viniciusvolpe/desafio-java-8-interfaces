package br.com.softplan.desafio.java.oito.classes.concretas;

import br.com.softplan.desafio.java.oito.interfaces.Coordenador;
import br.com.softplan.desafio.java.oito.interfaces.Gerente;

public class Funcionario implements Gerente, Coordenador{

	@Override
	public void gerarRelatorio() {
		// TODO Auto-generated method stub
		Coordenador.super.gerarRelatorio();
	}
	
}
