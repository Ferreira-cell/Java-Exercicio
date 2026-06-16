package com.mycompany.grasp;
    // =========================================================================
    // Padrão Relacionado: Essência do padrão CREATOR (Criador)
    // Justificativa: A classe Emprestimo encapsula e agrega as informações do Livro 
    // e da data. Seus atributos são inicializados de forma segura no construtor.
    // =========================================================================

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