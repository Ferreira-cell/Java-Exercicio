package com.mycompany.loja;

public class Produto {
    private final String nome;
    private final double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quant;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantEmEstoque);

        
    }
    
    public void adicionarAoEstoque(int quant){
        quantEmEstoque += quantEmEstoque;
    }
    
    public void removerDoEstoque(int quant){
        quantEmEstoque -= quantEmEstoque;
    }

    
} 



