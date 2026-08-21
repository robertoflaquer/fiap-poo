package br.com.fiapride.model;

public class Interruptor {

    private int tamanho;
    private String modelo;
    private String cor;
    private boolean ligado;

    public Interruptor(int tamanho, String modelo, String cor) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
    }

    // Método 1: ligar o interruptor
    // Regra: não pode ligar se já estiver ligado
    public void ligar() {
        if (ligado) {
            System.out.println("Erro: o interruptor já está ligado.");
            return;
        }
        ligado = true;
        System.out.println("Interruptor ligado com sucesso.");
    }

    // Método 2: desligar o interruptor
    // Regra: não pode desligar se já estiver desligado
    public void desligar() {
        if (!ligado) {
            System.out.println("Erro: o interruptor já está desligado.");
            return;
        }
        ligado = false;
        System.out.println("Interruptor desligado com sucesso.");
    }

    // Método 3: alterar a cor
    // Regra: cor não pode ser nula ou vazia
    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            System.out.println("Erro: a cor não pode ser vazia.");
            return;
        }
        this.cor = cor;
        System.out.println("Cor alterada para: " + cor);
    }

    // Método 4: alterar o tamanho
    // Regra: tamanho deve estar entre 1 e 5
    public void setTamanho(int tamanho) {
        if (tamanho < 1 || tamanho > 5) {
            System.out.println("Erro: tamanho inválido. Use um valor entre 1 e 5.");
            return;
        }
        this.tamanho = tamanho;
        System.out.println("Tamanho alterado para: " + tamanho);
    }

    public int getTamanho() { return tamanho; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public boolean isLigado() { return ligado; }

    @Override
    public String toString() {
        return "Interruptor [tamanho=" + tamanho + ", modelo=" + modelo
                + ", cor=" + cor + ", ligado=" + ligado + "]";
    }
}
