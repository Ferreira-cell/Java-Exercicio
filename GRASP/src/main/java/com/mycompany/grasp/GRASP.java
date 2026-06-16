package com.mycompany.grasp;

// =============================================================================
// Classe de Entrada / Interface de Simulação (Main)
// Justificativa: Esta classe apenas simula a interação do usuário. Note que ela 
// possui BAIXO ACOPLAMENTO (Low Coupling) com as entidades de negócio, pois ela 
// não cria os empréstimos diretamente; ela apenas pede para o Controller fazer isso.
// =============================================================================

public class GRASP {
    public static void main(String[] args) {
        // Cria o controlador que vai gerenciar as ações
        BibliotecaController biblioteca = new BibliotecaController();
        
        // Criando livros
        Livro livro1 = new Livro("Engenharia de Software com GRASP");
        Livro livro2 = new Livro("Java para Iniciantes");
        
        // Alimenta o acervo do controlador
        biblioteca.adicionarLivroNoAcervo(livro1);
        biblioteca.adicionarLivroNoAcervo(livro2);
        
        // O Main faz uma requisição ao Controlador (Uso do padrão Controller)
        System.out.println("Tentando realizar um empréstimo...");
        biblioteca.realizarEmprestimo(livro1, "16/06/2026");
        
        // Exibe os resultados
        biblioteca.listarEmprestimos();
    }
}
