/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csharptojavapilhaestatica;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class CsharpToJavaPilhaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao = 0; //Opcao default
        String valor;
        
        Pilha pilha = new Pilha(); //Cria uma instância da classe pilha
        do {
            try {
                System.out.println("Escolha o que deseja fazer: \n"
                        + "1 - Empilha\n"
                        + "2 - Desempilha\n"
                        + "3 - Mostra topo\n"
                        + "4 - Mostra tamanho\n"
                        + "9 - Sair\n");
                Scanner read = new Scanner(System.in);
                opcao = read.nextInt();
                read.nextLine();
                
                switch (opcao) {
                    case 1:
                        System.out.println("\nDigite o valor que deseja empilhar: ");
                        valor = read.nextLine();
                        pilha.empilha(valor);
                        break;
                    case 2:
                        valor = pilha.desempilha();
                        System.out.println("O valor desempilhado foi: " + valor);
                        break;
                    case 3:
                        valor = pilha.retornaTopo();
                        System.out.println("O topo é: " + valor);
                        break;
                    case 4:
                        System.out.println("O tamanho da pilha é: " + pilha.tamanho());
                        break;
                    case 5:
                        // sai do programa
                        System.out.println("Saindo da aplicação.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;     
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (opcao != 9);        
    }    
}
