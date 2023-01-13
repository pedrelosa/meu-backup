package cursoCod3r.conjuntos;

import java.util.ArrayList;

public class ListaUsuarios {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Carlos");
        lista.add(u1);

        lista.add(new Usuario("Karla"));
        lista.add(new Usuario("Heitor"));
        lista.add(new Usuario("Tatiana"));
        lista.add(new Usuario("Neide"));
        lista.add(new Usuario("Laura"));
        lista.add(new Usuario("Yuri"));
        lista.add(new Usuario("Nolan"));

        System.out.println(lista.get(3).nome);
        System.out.println(lista.get(1));

        System.out.println(lista.remove(4));
        System.out.println(lista.remove(new Usuario("Yuri")));

        System.out.println(lista.contains(new Usuario("Nolan")));

        for (Usuario item :
                lista) {
            System.out.println(item.nome);
        }

    }
}
