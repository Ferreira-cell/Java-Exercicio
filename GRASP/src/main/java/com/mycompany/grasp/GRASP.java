package com.mycompany.grasp;

public class GRASP {
    public static void main(String[] args) {
        BibliotecaController biblioteca = new BibliotecaController();

        Livro livro1 = new Livro("Engenharia de Software com GRASP");
        Livro livro2 = new Livro("Java para Iniciantes");

        biblioteca.adicionarLivroNoAcervo(livro1);
        biblioteca.adicionarLivroNoAcervo(livro2);

        System.out.println("Tentando realizar um empréstimo...");
        biblioteca.realizarEmprestimo(livro1, "16/06/2026");

        biblioteca.listarEmprestimos();
    }
}
