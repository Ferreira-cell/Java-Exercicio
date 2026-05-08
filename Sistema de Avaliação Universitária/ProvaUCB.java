package com.mycompany.universidade.prova;

public class ProvaUCB extends UniversidadeProva {

    public ProvaUCB(){
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;
    }

@Override
public double calcularMedia(){
    double nota1 = av1;
    double nota2 = av2;
    
    if(realizouProvaFinal){
        if(av1 < av2 && av3 > av1){
            nota1 = av3; 
        }
        else if (av2 <= av1 && av3 > av2){
            nota2 = av3;
        }
    }
return (nota1 * pesoAv1 + nota2 * pesoAv2) / (pesoAv1 + pesoAv2);

}
@Override
public ProvaFinalUniversidade getProvaFinalUniversidade(){
    return new ProvaAV3UCB(this);
            
}

}

