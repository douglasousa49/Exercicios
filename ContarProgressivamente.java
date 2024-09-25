package com.mycompany.funcaorecursiva;

import java.util.Scanner;

public class ContarProgressivamente {
    
static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num = maiorQueZero("Digite um numero maior que 0:");
        
        contarProgressivamente(num, 0);
    
    }
    
    public static void contarProgressivamente(int limite, int contador){
        
        System.out.println(contador);
        
        if(contador < limite)
        contarProgressivamente(limite, contador+1);
        
    }
    
    public static int maiorQueZero(String mensagem) {
        
        System.out.println(mensagem);
        int num = lerInt();
        
        if(num <= 0)
            return maiorQueZero(mensagem);
        else
            return num;      
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
