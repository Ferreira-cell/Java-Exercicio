package com.mycompany.universidade.prova;

public class ProvaFafifo extends UniversidadeProva{
    
    public ProvaFafifo(){
        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;
        this.mediaMinima = 6.0;
    }
@Override
public double calcularMedia(){
    double somaNotas = (av1 * pesoAv1) + (av2 * pesoAv2);
    double somaPesos = pesoAv1 + pesoAv2;
    
    if(realizouProvaFinal){
        somaNotas += (av3 * pesoAv3);
        somaPesos += pesoAv3;
    }
return somaNotas / somaPesos;
}
@Override
public ProvaFinalUniversidade getProvaFinalUniversidade(){
    return new ProvaFinalFafifo(this);

}
}
