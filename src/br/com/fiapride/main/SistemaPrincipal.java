package br.com.fiapride.main;

import br.com.fiapride.model.Interruptor;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Interruptor interruptor1 = new Interruptor(2, "Wifi", "Branco");
        System.out.println("--- Interruptor Criado ---");
        System.out.println("Modelo: " + interruptor1.modelo + " | Cor: " + interruptor1.cor + " | Tamanho: " + interruptor1.tamanho);

        System.out.println("Ligando o interruptor");
        interruptor1.ligar();
        System.out.println("Desligando o interruptor");
        interruptor1.desligar();

        System.out.println("Tentando desligar novamente (invalido)");
        interruptor1.desligar();
        interruptor1.ligar();
        System.out.println("Tentando ligar novamente (invalido)");
        interruptor1.ligar();

        System.out.println("Alterando a cor (valido)");
        interruptor1.alterarCor("Preto");

        System.out.println("Alterando a cor (invalido)");
        interruptor1.alterarCor("");

        System.out.println("Alterando o tamanho (valido)");
        interruptor1.alterarTamanho(4);

        System.out.println("Alterando o tamanho (invalido)");
        interruptor1.alterarTamanho(0);
        interruptor1.alterarTamanho(6);

        System.out.println("--- Estado final ---");
        System.out.println("Modelo: " + interruptor1.modelo + " | Cor: " + interruptor1.cor + " | Tamanho: " + interruptor1.tamanho + " | Ligado: " + interruptor1.ligado);
    }
}
