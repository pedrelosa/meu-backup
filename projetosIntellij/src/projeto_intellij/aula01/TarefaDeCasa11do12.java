package projeto_intellij.aula01;

//13. Construa um algoritmo para calcular o valor a ser pago pelo período de estacionamento do
//        autom
//        el (PAG). O usuário entra com os seguintes dados: hora (HE) e minuto (ME) de entrada,
//        hora (HS) e minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou seja, se
//        passar um minuto ele cobra a hora inteira. O valor cobrado pelo estacionamento é:
//        •R$ 4,00 para 1 hora de estacionamento
//        •R$ 6,00 para 2 horas de estacionamento
//        •R$ 1,00 por hora adicional (acima de 2 horas)

import javax.swing.JOptionPane;

public class TarefaDeCasa11do12 {
    public static void main(String[] args) {

        int valorASerpago = 0, horaEntrada = 0, horaSaida = 0, minutoEntrada = 0, minutoSaida = 0, saldoHorario = 0;

        horaEntrada = EntradaESaidaGrafico.converssaoInt(0, 23, "Qual a hora de entrada do veículo? ");
        minutoEntrada = EntradaESaidaGrafico.converssaoInt(0, 60, "Qual o minuto de entrada do veículo? ");
        horaSaida = EntradaESaidaGrafico.converssaoInt(horaEntrada, 23, "Qual a hora de saida do veículo?");
        minutoSaida = EntradaESaidaGrafico.converssaoInt(minutoEntrada + 1, 60, "Qual o minuto de saida do veículo?");

        if (minutoSaida - minutoEntrada > 0) {
            horaSaida++;
        }

        saldoHorario = horaSaida - horaEntrada;

        if (saldoHorario >= 2) {
            valorASerpago = 6;
            if (saldoHorario > 2) {
                valorASerpago = valorASerpago + (saldoHorario - 2);
            }
        }else {
            valorASerpago = 4;
        }

        JOptionPane.showMessageDialog(null, "O valor a ser pago é R$ " + valorASerpago);


    }
}
