package com.mycompany.universidade.prova;

public abstract class ProvaFinalUniversidade {
    
    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;
    protected UniversidadeProva prova;
    
    public ProvaFinalUniversidade(UniversidadeProva prova){
        this.prova = prova;
        this.realizouProva = false;
    }
    public abstract boolean habilitadoRealizarProva();
    
    public void aplicarNotaFinal(double nota){
        if(habilitadoRealizarProva()){
            this.notaProvaFinal = nota;
            this.realizouProva = true;
            this.prova.setAv3(nota);
            System.out.println("-> Prova Final realizada com sucesso.");
        } else {
            System.out.println("-> Aluno não esta habilitado para realizar a prova final.");
        }
    }
}

