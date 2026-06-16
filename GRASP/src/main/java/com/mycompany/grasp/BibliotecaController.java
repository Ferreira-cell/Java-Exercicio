package com.mycompany.grasp;
// =============================================================================
// Padrão Aplicado: CONTROLLER (Controlador)
// Por que atende ao GRASP: A classe BibliotecaController atua como o cérebro do 
// sistema. Ela é o primeiro objeto além da interface (Main) que recebe, coordena 
// e dita o fluxo das operações de negócio (adicionar livros, realizar empréstimos).
// Isso evita que a interface cuide da lógica, garantindo ALTA COESÃO.
// =============================================================================

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
    // =============================================================================
    // Padrão Aplicado: CREATOR (Criador)
    // Por que atende ao GRASP: O método 'realizarEmprestimo' é o responsável por 
    // instanciar (criar) o objeto Emprestimo. O controlador é a entidade ideal para 
    // ser o "Criador" aqui porque ele armazena e gerencia diretamente a lista de 
    // todos os 'emprestimoAtivos' do sistema.
    // =============================================================================

    public void realizarEmprestimo(Livro livro, String data) {
        // Validação de negócio antes de criar o objeto
        if (this.acervo.contains(livro)) {
            // Aplicação prática do Criador: instanciação do objeto
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
