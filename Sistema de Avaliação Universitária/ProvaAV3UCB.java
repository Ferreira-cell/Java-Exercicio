package com.mycompany.universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade{
    
    public ProvaAV3UCB(UniversidadeProva prova){
        super(prova);
        this.pesoProvaFinal = 1;
    }
@Override
public boolean habilitadoRealizarProva(){
    return true;
}
}
