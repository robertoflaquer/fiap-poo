package br.com.fiapride.main;

import br.com.fiapride.model.Interruptor;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Interruptor interruptor1 = new Interruptor();
		interruptor1.tamanho = 2;
		interruptor1.modelo = "Wifi";
		interruptor1.cor = "Branco";
		System.out.println("Meu interruptor é: " + interruptor1.cor);
	}

}
