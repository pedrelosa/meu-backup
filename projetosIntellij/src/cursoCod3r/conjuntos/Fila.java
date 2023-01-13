package cursoCod3r.conjuntos;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adiciona um elemento na fila
        fila.add("Hagata");//     Gera um erro caso a fila tenha limite e não dê para adicionar
        fila.offer("Dilan");// Retorna False caso a fila tenha limite e não dê para adicionar
        fila.offer("Lilia");
        fila.offer("Golar");
        fila.offer("Giu");
        fila.offer("Oliver");
        fila.offer("Gande");

        // Obtem o proximo elemento da fila (sem remover)
        System.out.println(fila.peek());//      Retorne Fasle caso não seja possível pegar
        System.out.println(fila.peek());//      o elemento
        System.out.println(fila.element());//   Gera um erro caso não seja possível pegar
        System.out.println(fila.element());//   o elemento


//        fila.size();//      Retorna tamanho da lista
//        fila.clear();//     Limpa a lista
//        fila.isEmpty();//   Retorna se a fila está ou não vazia

        //Obtem o proximo elemento da fila e o remove
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());// Gera um erro caso não haja item para pegar
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());// Caso não haja item para pegar, retorna null


    }
}
