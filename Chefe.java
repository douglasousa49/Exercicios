package com.mycompany.chefe;

import java.util.Scanner;

public class Chefe { 
   
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
    
    int N;
        
        while (true){        
            System.out.println("Quantos numeros voce ira me informar?");
            N = lerInt();
            
            if (N < 1 || N > 100000){
            System.out.println("Digite um valor entre 1 e 100.000.");
        }else{
            break;
        }
    }
       
        int[] numeros = new int[N];
       
        for (int i = 0; i < numeros.length; i++) {
            
            while(true){
            
            System.out.println("Diga o número " + (i + 1) + ":");
            numeros[i] = lerInt();
            
            if(numeros[i] < 0 || numeros[i] > 100){
                System.out.println("Digite um numero entre 0 e 100.");
            }else{
                break;
            }
        }
    }

    numeros = processarNumeros(numeros);
       
    int soma = somar(numeros);
    
    if(soma < 0 || soma > 1000000){
        System.out.println("A soma dos números excede o limite permitido de 1.000.000.");
    }else{
        System.out.println("A soma dos números são: " + soma);
    }    
}
   
    public static int[] processarNumeros (int[] numeros){
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == 0){
               
                int valor = i - 1;
               
                while(valor >= 0 && numeros[valor] == 0){
                    valor --;
                }
                if (valor >= 0) {
                    numeros[valor] = 0;
                }else{
                System.out.println("Voce nao tinha nenhum valor anterior a posicao: " + (i+1) + " para apagar.");
            }            
        }
    }
    return numeros;
}

    public static int somar (int [] numeros){

    int soma = 0;
    for (int i : numeros) {
        soma += i;
    }
    return soma;
    }

    public static int lerInt() {        

        while(true){
            var linha = ler.nextLine();            
            try {
                return Integer.parseInt(linha);
            }
            catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro.");
           }
        }
    }
}