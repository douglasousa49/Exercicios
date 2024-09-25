package com.mycompany.funcaorecursiva;

import java.util.Scanner;

public class Tabuada {
    
static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Digite um numero:");
        int num = lerInt();
        calcularTabuada(num, 1, 10);
    
    }
    
    public static void calcularTabuada(int numero, int cont, int limite){
        
        int resultado = numero * cont;
        
        System.out.println(numero + " x " + cont + " = " + resultado);
               
        if(cont < limite)
        calcularTabuada(numero, cont+1, limite);
        
    }
    
    public static int lerInt() {
        
        var linha = ler.nextLine();
        try {
            return Integer.parseInt(linha);
        }
        catch (NumberFormatException erro) {
            System.out.println("Digite um número inteiro.");
            return lerInt();
        }
    }
}

