package com.mycompany.grasp;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private final List<Livro> acervo;
    private final List<Emprestimo> emprestimoAtivos;

    public BibliotecaController() {
        this.acervo = new ArrayList<>();
        this.emprestimoAtivos = new ArrayList<>();
    }

    public void adicionarLivroNoAcervo(Livro livro) {
        this.acervo.add(livro);
    }

    public void realizarEmprestimo(Livro livro, String data) {
        if (this.acervo.contains(livro)) {
            Emprestimo novoEmprestimo = new Emprestimo(livro, data);
            this.emprestimoAtivos.add(novoEmprestimo);
            System.out.println("-> Empréstimo registrado com sucesso!");
        } else {
            System.out.println("-> Erro: Livro não disponível no acervo.");
        }
    }

    public void listarEmprestimos() {
        System.out.println("\n--- Lista de Empréstimos Ativos ---");
        if (this.emprestimoAtivos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
        } else {
            for (Emprestimo e : this.emprestimoAtivos) {
                e.exibirDetalhes();
            }
        }
    }
}
