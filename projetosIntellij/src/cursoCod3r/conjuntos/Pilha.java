package cursoCod3r.conjuntos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");// Retorna False caso não seja possível adicionar o item
        livros.push("Don Quixote");// Gerra um erro caso não seja possível adicionar o item
        livros.push("Os miseráveis");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.pop());// Mesma função de remove
        System.out.println(livros.remove());
        System.out.println(livros.poll());


    }
}
