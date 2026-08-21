package br.com.fiapride.main;

import br.com.fiapride.model.Interruptor;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("=== Criando o interruptor ===");
        Interruptor interruptor1 = new Interruptor(2, "Wifi", "Branco");
        System.out.println(interruptor1);

        System.out.println("\n=== Testando ligar/desligar (valores válidos) ===");
        interruptor1.ligar();
        interruptor1.desligar();

        System.out.println("\n=== Testando ligar/desligar (valores inválidos) ===");
        interruptor1.desligar(); // já está desligado
        interruptor1.ligar();
        interruptor1.ligar();   // já está ligado

        System.out.println("\n=== Testando setCor (valores válidos) ===");
        interruptor1.setCor("Preto");
        System.out.println("Cor atual: " + interruptor1.getCor());

        System.out.println("\n=== Testando setCor (valores inválidos) ===");
        interruptor1.setCor("");    // cor vazia
        interruptor1.setCor(null);  // cor nula

        System.out.println("\n=== Testando setTamanho (valores válidos) ===");
        interruptor1.setTamanho(4);
        System.out.println("Tamanho atual: " + interruptor1.getTamanho());

        System.out.println("\n=== Testando setTamanho (valores inválidos) ===");
        interruptor1.setTamanho(0);  // menor que 1
        interruptor1.setTamanho(6);  // maior que 5

        System.out.println("\n=== Estado final do interruptor ===");
        System.out.println(interruptor1);
    }
}
