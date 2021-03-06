/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csharptojavapilhaestatica;

/**
 *
 * @author Windows 10
 */
public class Pilha {
    private final int capacidade = 5; //Capacidade máxima da pilha
    private final String dados[] = new String[capacidade]; //Vetor para guardar os dados da pilha.
    private int topo = -1; //Variável que irá indicar a posição no vetor do topo da pilha.
    
    // este método informa o tamanho da pilha
    public int tamanho() {
        return topo +1;
    }
    
    // este método retorna true se a pilha estiver vazia
    public boolean vazia(){
        return tamanho() == 0;        
    }
    
    // este método empilha um valor string na pilha
    public void empilha(String p_valor) throws Exception{
        if(tamanho() != capacidade) {
            topo++;
            dados[topo] = p_valor;
        }
        else{
            throw new Exception("A pilha está cheia.");
        }
    }
    
    // este método desempilha um valor da pilha
    public String desempilha() throws Exception {
        if(vazia() == true ){
            throw new Exception("A pilha está vazia.");
        }
        else{
            topo--;
            return dados[topo + 1];
        }
    }
    
    // este método devolve o valor que está no topo
    public String retornaTopo() throws Exception{
        if (vazia() == true ) {
            throw new Exception("A pilha está vazia.");
        }
        else {
            return dados[topo];
        }
    }
}
