package cursoCod3r.conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
//        Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("João");
        listaAprovados.add("Heitor");
        listaAprovados.add("Gabriel");
        listaAprovados.add("Lavina");

        for (String aprovado :
                listaAprovados) {
            System.out.println(aprovado);
        }

    }
}
