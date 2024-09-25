package com.mycompany.arraylisttarefas;

import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {

            System.out.println("===== MENU =====");
            System.out.println("1 - Nova Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Remover Tarefas");
            System.out.println("4 - Marcar como Resolvido");
            System.out.println("0 - Sair");

            int escolha = lerInt();

            switch (escolha) {

                case 1:
                    System.out.println("Digite a nova tarefa:");
                    String task = ler.nextLine();
                    adicionar(tarefas, task);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;

                case 2:
                    System.out.println("===== Lista de Tarefas =====");
                    System.out.println("");
                    listar(tarefas);
                    break;

                case 3:
                    while (true) {
                        System.out.println("Digite o numero da tarefa a ser removida:");
                        int numero = lerInt();

                        int index = numero - 1;

                        if (index < 0 || index >= tarefas.size()) {
                            System.out.println("Digite um número de uma tarefa válida.");
                        } else {
                            System.out.println("Tarefa " + tarefas.get(index) + " removida com sucesso.");
                            remover(tarefas, index);
                            break;
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        System.out.println("Digite o numero da tarefa que foi concluida:");
                        int numero = lerInt();

                        int index = numero - 1;

                        if (index < 0 || index >= tarefas.size()) {
                            System.out.println("Digite um número de uma tarefa válida.");
                        } else {
                            concluido(tarefas, index);
                            System.out.println("Tarefa " + tarefas.get(index) + " concluida com sucesso.");
                            break;
                        }
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Escolha invalida.");
            }
        }
    }

    public static void adicionar(ArrayList<String> tarefas, String mensagem) {
        tarefas.add(mensagem);
    }

    public static void listar(ArrayList<String> tarefas) {
        for (int i = 0; i < tarefas.size(); i++) {
            String pegar = tarefas.get(i);
            System.out.println((i + 1) + " - " + pegar);
        }
    }

    public static void remover(ArrayList<String> tarefas, int remover) {
        tarefas.remove(remover);
    }

    public static void concluido(ArrayList<String> tarefas, int resolver) {
        if (tarefas.get(resolver).endsWith(" - (OK)")) {
            System.out.println("Essa tarefa já foi concluída.");
        } else {
            String resolvido = tarefas.get(resolver) + " - (OK)";
            tarefas.set(resolver, resolvido);
            System.out.println("Tarefa concluída com sucesso.");
        }
    }

    public static int lerInt() {

        while (true) {
            var linha = ler.nextLine();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro.");
            }
        }
    }
}