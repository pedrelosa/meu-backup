package leitorMercadoPago;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorArquivo {

    public static void main(String[] args) {
        Path caminhoArquivoParaLer = Paths.get("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\leitorMercadoPago\\src\\mp.txt");
        Path caminhoArquivoParaEscrever = Paths.get("C:\\Users\\pedre\\IdeaProjects\\projetosIntellij\\src\\leitorMercadoPago\\src\\prog.txt");
        boolean ehModulo = true;
        char caracterDeTroca = '.';
        int qualLinha = 1, numeroAuxiliarTroca = 0, indiceTexto=0, indiceTextoParaExcrever=0, quantidadeNulls = 0, cn=0;

        try {
            byte[] texto = Files.readAllBytes(caminhoArquivoParaLer);

            for (int i = 0; i < texto.length; i++) {
                numeroAuxiliarTroca = texto.length;

//                System.out.print(i+"|"+texto[i]+"|");
//                System.out.println( (char) texto[i]);
                if (texto[i] == 13&&texto[i+1] == 10&&texto[i+2] == 13&&texto[i+3] == 10){//Significa que comecou ou terminou o módulo de gasto
                    qualLinha = 1;
                    texto[i] = 0;
                    texto[i+1] = 0;
                    texto[i+2] = 13;
                    texto[i+3] = 10;
                    i+=3;
                    quantidadeNulls += 2;
                }else{
                    if (texto[i] == 13&&texto[i+1] == 10){
                        qualLinha++;
                        if (qualLinha==2||qualLinha==3||qualLinha==8) {
                            texto[i] = ';';
                            texto[i+1] = 0;
                            i++;
                            quantidadeNulls++;
                        }
                        if (qualLinha==7) {
                            texto[i] = ',';
                            texto[i+1] = 0;
                            quantidadeNulls++;
                            i++;
                        }

                    } else if (qualLinha==3||qualLinha==4||qualLinha==5) {
                        texto[i]= 0;
                        quantidadeNulls++;
                    }


                }

            }

            byte[] textoParaExcrever = new byte[texto.length-quantidadeNulls];

            for (int i = 0; i < texto.length; i++) {
            }

            for (byte a :
                    texto) {
                System.out.print((char) a);
            }

            //System.out.println(texto.length+"|"+textoParaExcrever.length);

            try {

            }catch (Exception erro){

            }

        }catch (Exception erro){

        }

    }

}
