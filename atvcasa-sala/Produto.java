
package com.mycompany.estoque;


public class Produto {
    private String nome;
    private double preco;
    private int quantEmEstoque;
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quant;
    }
    
    public void exixbirInformacoes(){
        System.out.println("Nme do produto: " + nome);
        System.out.println("Preco do produto" + preco);
        System.out.println("Quantidade do produt" + quantEmEstoque);

        
    }
    
    public void adicionarAoEstoque(int quant){
        quantEmEstoque += quant;
    }
    
    public void removerDoEstoque(int quant){
        quantEmEstoque += quant;
    }

    void exibirInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}



