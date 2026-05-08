package universidade.prova.teste;

import com.mycompany.universidade.prova.*;

public class Teste {
    
    public static void main(String[] args){
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        System.out.println("       SISTEM DE NOTA UCB     ");
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        
            UniversidadeProva alunoUcb = new ProvaUCB();
            alunoUcb.setAv1(5.0);
            alunoUcb.setAv2(6.0);
            
        System.out.printf("Media Parcial UCB: %.2f\n", alunoUcb.calcularMedia());
        System.out.println("Status Parcial: " + (alunoUcb.aprovado()? "Aprovado" : "Reprovado"));

        System.out.println("\n´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        System.out.println("     SISTEM DE NOTAS FAFIFO     ");
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        
        UniversidadeProva alunoFafifo = new ProvaFafifo();
        alunoFafifo.setAv1(4.0);
        alunoFafifo.setAv2(6.0);
        
        System.out.printf("Media Parcial FAfifo: %.2f\n", alunoFafifo.calcularMedia());
        System.out.println("Status Parcial: " + (alunoFafifo.aprovado()? "Aprovado" : "Reprovado"));

        ProvaFinalUniversidade finalFafifo = alunoFafifo.getProvaFinalUniversidade();
        finalFafifo.aplicarNotaFinal(8.0);
        
        System.out.printf("Média Final Fafifo: %.2f\n", alunoFafifo.calcularMedia());
        System.out.println("Status Final: " + (alunoFafifo.aprovado() ? "Aprovado" : "Reprovado"));
        

    }
    
}
