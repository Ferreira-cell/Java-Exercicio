
package com.mycompany.estoque;

public class TestaProduto {
    
    public static void main(String[] args){
        Produto p1 = new Produto("Monitor 24", 900, 10);
        Produto p2 = new Produto("CPU", 300, 25);
        Produto p3 = new Produto("Mouse", 100, 30);
        
        
        p1.exibirInformacoes();
        System.out.println("***************");
        p2.exibirInformacoes();
        System.out.println("***************");
        p3.exibirInformacoes();
        System.out.println("***************");
        
        
        p1.adicionarAoEstoque(10);
        p1.exibirInformacoes();
        System.out.println("***************");
    }
    
}


