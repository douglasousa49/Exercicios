package com.mycompany.parcelamentointeiro;

import java.util.Scanner;

public class ParcelamentoSemJuros {
 
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
    
    int V;
    int P;
        
        while (true){        
            System.out.println("Qual foi o valor total da compra?");
            V = lerInt();
            
            if (V < 10 || V > 1000){
                System.out.println(" Digite um valor entre 10 e 1000.");
            }else{
                break;
        }
    }
        
        while (true){        
            System.out.println("O pagamento sera feito em quantas parcelas?");
            P = lerInt();
            
            if (P < 2 || P > 18){
                System.out.println(" Digite um valor entre 2 e 18 parcelas.");
            }else if (P > V){
                System.out.println("Digite um valor de parcela menor ou igual ao valor de compra.");
            }else{
                break;
        }
    }
        
        int[] Parcelas = new int[P];
        
        int valorParcela = calcularParcelas( V , P );
        
        int sobra = calcularSobra( V , P );
        
        for (int i = 0; i < Parcelas.length; i++) {
            Parcelas [i] = valorParcela;
        }
        
        for (int i = 0; i < sobra; i++) {
            Parcelas[i] += 1;
        }
        
        for (int i = 0; i < Parcelas.length; i++) {
            System.out.println("A " + (i+1) + "º parcela será: " + Parcelas[i]);
        }
    }
    
    public static int calcularParcelas (int V, int P){
        
        int divisao;
        divisao = V / P;
        
        return divisao;
    }
    
    public static int calcularSobra (int V, int P){
        
        int sobra;
        sobra = V % P;
        
        return sobra;
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
