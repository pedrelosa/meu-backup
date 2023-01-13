package leitorMercadoPago;

import java.io.*;

public class ManipuladorArquivo {
    public static String Ler(String caminho){
        String conteudo = "";

        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader leitorArquivo = new BufferedReader(arquivo);
            String linha = "";
            try {
                linha = leitorArquivo.readLine();
                while (linha != null) {
                    conteudo += linha;
                    linha = leitorArquivo.readLine();
                }
                arquivo.close();
            } catch (IOException e){
                conteudo = "Erro";
            }
        }catch (FileNotFoundException e){
            conteudo = "Erro";
        }

        return conteudo;
    }

    public static void Escrever (String caminho, String texto){
        try {
            FileWriter arquivo = new FileWriter(caminho);
            PrintWriter gravadorArquivo = new PrintWriter(arquivo);
            gravadorArquivo.println(texto);
            gravadorArquivo.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
