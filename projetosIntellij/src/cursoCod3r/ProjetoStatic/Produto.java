package cursoCod3r.ProjetoStatic;

public class Produto {

    double valorProduto;
    String nomeProduto;
    static double desconto = 0.2;

    public double valorDescontado(){
        return valorProduto - (valorProduto*desconto);
    }


}
