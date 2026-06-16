package com.mycompany.grasp;

public class Emprestimo {
    private final Livro livro;
    private final String dataEmprestimo;

    public Emprestimo(Livro livro, String dataEmprestimo) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + this.livro.getTitulo() + " | Data: " + this.dataEmprestimo);
    }
}