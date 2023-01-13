package cursoCod3r.conjuntos;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1,"Liara");
        usuarios.put(2,"Poliana");
        usuarios.put(3,"Tales");
        usuarios.put(4,"Vector");
        usuarios.put(5,"Sara");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Tales"));

        System.out.println(usuarios.get(5));


        for (Map.Entry<Integer, String> registro :
                usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
        

    }
}
