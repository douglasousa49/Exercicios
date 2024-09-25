package com.mycompany.funcaorecursiva;

import java.util.Scanner;

public class ContarRegressivo {
    
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Digite um numero:");
        int num = lerInt();
        
        if(num > 0)
            contarRegressivoPositivo(num);
        else
            contarRegressivoNegativo(num);
    
    }
    
    public static void contarRegressivoNegativo(int cont){
        
        System.out.println(cont);
        
        if(cont < 0)
        contarRegressivoNegativo(cont+1);
        
    }
    
    public static void contarRegressivoPositivo(int cont){
        
        System.out.println(cont);
        
        if(cont > 0)
        contarRegressivoPositivo(cont-1);
        
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
