package cursoCod3r.ProjetoStatic;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nomeProduto = "";
        p1.valorProduto = 34.2;

        System.out.println(p1.valorDescontado());

    }
}
