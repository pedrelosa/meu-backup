package aulaIwTraining;

import javax.swing.*;

public class Ex02 {
    public static void main(String[] args) {
        int quantidadePar=0, quantidadeImpar=0, mediaPares=0, mediaIpares = 0, mediaGeral=0, numeroAtual, ultimoNumero = 0, ultimoPar=0, ultimoImpar=0;
        boolean continua = true;

        numeroAtual = EntradaESaidaGrafico.converssaoInt(0,10000000,"Digite um número. Para terminar, digite 0 ");

        if (numeroAtual == 0) {
            continua = false;
        }else {
            if (numeroAtual%2==0) {
                quantidadePar++;
            }else {
                quantidadeImpar++;
            }
            ultimoNumero = numeroAtual;
        }

        while (continua){
            numeroAtual = EntradaESaidaGrafico.converssaoInt(0,10000000,"Digite um número. Para terminar, digite 0 ");

            if (numeroAtual == 0) continua = false;

            if (numeroAtual%2==0) {
                quantidadePar++;
                mediaPares = (ultimoPar + numeroAtual)/2;
                ultimoPar = numeroAtual;
            }else {
                quantidadeImpar++;
                mediaIpares = (ultimoImpar + numeroAtual)/2;
                ultimoImpar = numeroAtual;
            }
            mediaGeral = (ultimoNumero + numeroAtual)/2;
            ultimoNumero = numeroAtual;

        }

        JOptionPane.showMessageDialog(null,"A quantidade de números pares é: "+quantidadePar+
                "\nA quantidade de números impares é: "+quantidadeImpar+
                "\nA media dos pares é: "+mediaPares+
                "\nA media dos impares é: "+ mediaIpares+
                "\nA media geral é: "+mediaGeral);

    }
}
