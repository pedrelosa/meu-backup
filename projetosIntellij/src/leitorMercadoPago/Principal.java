package leitorMercadoPago;

public class Principal {
    public static void main(String[] args) {
        String caminhoAqruivoParaLer = "C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\leitorMercadoPago\\src\\mp.txt", caminhoAqruivoParaEscrever = "C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\leitorMercadoPago\\src\\prog.txt";
        String textoLido = "", textoParaEscrever = "";
        char catacterLido = '¨';
        textoLido = ManipuladorArquivo.Ler(caminhoAqruivoParaLer);

        for (int i = 0; i < textoLido.length(); i++) {
            catacterLido = textoLido.charAt(i);
            if (catacterLido == 'a'){
                System.out.println("Deubom");
            }
        }



        ManipuladorArquivo.Escrever(caminhoAqruivoParaEscrever,textoParaEscrever);
    }
}
