package com.mycompany.atvcasa;

import java.util.Scanner;

public class Atvcasa {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("\n-- MENU DE EXERCÍCIOS ---");
            System.out.println("1. Soma de 4 números");
            System.out.println("2. Média aritimética (3 notas)");
            System.out.println("3. Média ponderada (3 notas");
            System.out.println("4. Aumento de 25%");
            System.out.println("5. Aumento percentual variável");
            System.out.println("6. Sálario Base (Gratificação e Imposto)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite 4 número: ");
                    int n1 = teclado.nextInt(), n2 = teclado.nextInt(), n3 = teclado.nextInt(), n4 = teclado.nextInt();
                    System.out.println("Soma: " + (n1 + n2 + n3 + n4));
                }
                    
                case 2 -> {
                    System.out.println("Digite 3 notas: ");
                    double nota1 = teclado.nextDouble(), nota2 = teclado.nextDouble(), nota3 = teclado.nextDouble();
                    System.out.println("Média: " + ((nota1 + nota2 + nota3) / 3));
                }
                    
                case 3 -> {
                    System.out.println("Nota 1 e Peso 1:");
                    double v1 = teclado.nextDouble(), p1 = teclado.nextDouble();
                    System.out.println("Nota 2 e Peso 2:");
                    double v2 = teclado.nextDouble(), p2 = teclado.nextDouble();
                    System.out.println("Nota 3 e Peso 3:");
                    double v3 = teclado.nextDouble(), p3 = teclado.nextDouble();
                    double mp = (v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3);
                    System.out.println("Média Ponderada: " + mp);
                }
                    
                case 4 -> {
                    System.out.print("Salário atual: ");
                    double sal4 = teclado.nextDouble();
                    System.out.println("Novo salário (25%): R$" + (sal4 * 1.25));
                }
                
                case 5 -> {
                    System.out.print("Salário: ");
                    double sal5 = teclado.nextDouble();
                    System.out.print("Percentual de aumento: ");
                    double perc = teclado.nextDouble();
                    double aumento = sal5 * (perc / 100);
                    System.out.println("Aumento: R$ " + aumento + "Novo: R$" + (sal5 + aumento));
                }
                    
                case 6 -> {
                    System.out.print("Salário: ");
                    double base = teclado.nextDouble();
                    double grat = base * 0.05;
                    double imp = base * 0.07;
                    System.out.println("Salário Final: R$" + (base + grat - imp));
                }
                    
                case 0 -> System.out.println("Saindo...");
                    
                default -> System.out.println("Opção inválida!");
                           
                        
            }
            
        }while(opcao !=0);
    }
}
