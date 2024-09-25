package com.mycompany.funcaorecursiva;

import java.util.Scanner;

public class CalcularFatorial {
    
static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num = numeroMaiorQueZero("Digite um número maior que 0:");
        
        fatorial(num, num - 1, 1);
    
    }
    
    public static void fatorial(int numero, int cont, int limite){
        
        int resultado = numero * cont;
               
        if(cont > limite)
        fatorial(resultado, cont-1, limite);
        
        else
        System.out.println(resultado);   
    }
    
    public static int numeroMaiorQueZero(String mensagem) {
        
        System.out.println("Digite um número maior que 0:");
        int num = lerInt();
        
        if (num >= 0)
            return num;
        else
            return numeroMaiorQueZero(mensagem);        
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

