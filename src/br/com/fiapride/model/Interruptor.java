package br.com.fiapride.model;

public class Interruptor {

    public int tamanho;
    public String modelo;
    public String cor;
    public boolean ligado;

    public Interruptor(int tamanho, String modelo, String cor) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
    }

    public void ligar() {
        // Regra de negócio: não pode ligar se já estiver ligado
        if (ligado) {
            System.out.println("Erro: o interruptor já está ligado.");
            return;
        }
        this.ligado = true;
        System.out.println("Interruptor ligado com sucesso.");
    }

    public void desligar() {
        // Regra de negócio: não pode desligar se já estiver desligado
        if (!ligado) {
            System.out.println("Erro: o interruptor já está desligado.");
            return;
        }
        this.ligado = false;
        System.out.println("Interruptor desligado com sucesso.");
    }

    public void alterarCor(String novaCor) {
        // Regra de negócio: a nova cor não pode ser vazia
        if (novaCor.isEmpty()) {
            System.out.println("Erro: a cor não pode ser vazia.");
            return;
        }
        this.cor = novaCor;
        System.out.println("Cor alterada para: " + novaCor);
    }

    public void alterarTamanho(int novoTamanho) {
        // Regra de negócio: o tamanho deve estar entre 1 e 5
        if (novoTamanho < 1 || novoTamanho > 5) {
            System.out.println("Erro: tamanho invalido. Use um valor entre 1 e 5.");
            return;
        }
        this.tamanho = novoTamanho;
        System.out.println("Tamanho alterado para: " + novoTamanho);
    }
}
