package com.mycompany.formageometrica;

public class SistemaGeometria {
    public static void main(String[] args) {
        
        FormaGeometrica ret = new Retangulo(5.0, 10.0);
        FormaGeometrica circ = new Circulo(3.0);

       
        System.out.println("--- Retângulo ---");
        System.out.printf("Área: %.2f\n", ret.calcularArea());
        System.out.printf("Perímetro: %.2f\n", ret.calcularPerimetro());

       
        System.out.println("\n--- Círculo ---");
        System.out.printf("Área: %.2f\n", circ.calcularArea());
        System.out.printf("Perímetro: %.2f\n", circ.calcularPerimetro());
    }
}