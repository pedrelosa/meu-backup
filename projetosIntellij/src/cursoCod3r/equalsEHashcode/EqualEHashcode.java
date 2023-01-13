package cursoCod3r.equalsEHashcode;

public class EqualEHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro";
        u1.email = "pedo.sla@gmail.com";


        Usuario u2 = new Usuario();
        u2.nome = "Pedro";
        u2.email = "pedo.sla@gmail.com";

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));


    }
}
