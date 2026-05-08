package com.mycompany.universidade.prova;

public class ProvaFinalFafifo  extends ProvaFinalUniversidade{
    
    public ProvaFinalFafifo(UniversidadeProva prova){
        super(prova);
        this.pesoProvaFinal = 3;
        
    }
@Override
public boolean habilitadoRealizarProva(){
    return !prova.aprovado();
}
}
