package com.mycompany.funcaorecursiva;

import java.util.Scanner;

public class Media {
    
static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = quantasNotas("Digite quantas notas ira calcular a media:"); 
        
        double[] notas = new double[n];
        
        double media = calcularMedia(notas, 0, 0);
        
        System.out.println("A media foi: " + media);
    
    }
    
    public static int quantasNotas(String mensagem) {
        
        System.out.println(mensagem);
        int vetor = lerInt();
        
        if(vetor <= 1)
            return quantasNotas("Digite um valor maior que 1.");
        else
            return vetor;       
    }
    
    public static double valorNota(String mensagem) {
        
        System.out.println(mensagem);
        double n = lerDouble();
        
        if(n < 0 || n > 10)
            return valorNota("Digite uma nota entre 0 e 10.");
        else
            return n;
        
    }
        
    public static double calcularMedia(double[] notas, double cont, double somador){
                
        double nota;
        
        if(cont < notas.length){
            nota = valorNota("Digite a nota:");
            return calcularMedia(notas, cont+1, somador+nota);
        }else{
            return somador / notas.length;
        }
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

    
    public static double lerDouble() {
        
        var linha = ler.nextLine();
        try {
            return Double.parseDouble(linha);
        }
        catch (NumberFormatException erro) {
            System.out.print("Digite um número real. \n");
            return lerDouble();
        }
    }
}
