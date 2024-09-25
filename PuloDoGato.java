package com.mycompany.pulodogato;

import java.util.Scanner;

public class PuloDoGato {
    
static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
    
    int C;
        
        while (true){        
            System.out.println("Quantas lajotas o Gato tera pela frente?");
            C = lerInt();
            
            if (C < 1 || C > 10000){
            System.out.println(" Digite um valor entre 1 e 10.000.");
        }else{
            break;
        }
    }
        
        int[] lajotas = new int[C];
        lajotas [0] = 1;
        lajotas [lajotas.length -1 ] = 1;
       
        for (int i = 1; i < lajotas.length - 1; i++) {
            System.out.println("Lajota: Posição " + (i+1) + " Digite 1 para lajota preta e 0 para lajota branca:");
            lajotas[i] = lerOpcional();
        }
        int pulos = processarPulos(lajotas);
        System.out.println("A quantidade de pulos foi: " + pulos);
    }
    
    public static int processarPulos (int[] lajotas){
        int pulos = 0;
        int contador = 0;
        int tamanho = lajotas.length;
        
        while (contador < tamanho - 1) {
        
            if (contador + 2 < tamanho && lajotas[contador + 2] == 1) {
                contador += 2;
            } else if (contador + 1 < tamanho && lajotas[contador + 1] == 1) {
                contador += 1;
            } else {
                return -1;
            }
            pulos++;
        }
            return pulos;
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
    
    public static int lerOpcional(){
        int inteiro;

        while (true) {
            var linha = ler.nextLine();
            try {
                inteiro = Integer.parseInt(linha);
                if (inteiro == 0 || inteiro == 1) {
                    return inteiro;
                } else {
                    System.out.println("Digite 1 para pintar lajota de preta ou 0 para pintar a lajota de branco.");
                }
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro.");
            }
        }
    }
}