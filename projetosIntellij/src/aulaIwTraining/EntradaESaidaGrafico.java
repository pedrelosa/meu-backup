package aulaIwTraining;

import javax.swing.*;

public class EntradaESaidaGrafico {

    /**
     * Imprime um <code>JOptionPane</code> na tela e retorna o resultado em <code>int</code>
     *
     * @param min Significa o valor mínimo aceitavel pela função
     * @param max Significa o valor máximo aceitavel pela função
     * @param texto Significa a mensagem que vai ser impressa ne tela
     * @return o que foi digitado pelo usuário
     */
    public static int converssaoInt(int min, int max, String texto) {
        int x = 0;
        boolean itsOk = false;
        String y = "valor inicial";
        while (!itsOk) {
            try {
                y = JOptionPane.showInputDialog(texto);
                x = Integer.parseInt(y);
                if (x <= max && x >= min) {
                    itsOk = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "O valor digitado está fora dos parametros normais!! Tente novamente");
                }
            } catch (NumberFormatException a) {

                if (y == null) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Você digitou errado!! Tente novamente");
                }

            }
        }

        return x;
    }

    /**
     * Imprime um <code>JOptionPane</code> na tela e retorna o resultado em <code>double</code>
     *
     * @param min Significa o valor mínimo aceito pela função
     * @param max Significa o valor máximo aceito pela função
     * @param texto Significa a mensagem que vai ser impressa ne tela
     * @return o que foi digitado pelo usuário
     */
    public static double converssaoDouble(double min, double max, String texto) {
        double x = 0;
        boolean itsok = false;
        String y = "valor inicial";
        while (!itsok) {
            try {
                y = JOptionPane.showInputDialog(texto);
                x = Double.parseDouble(y);
                if (x <= max && x >= min) {
                    itsok = true;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "O valor digitado está fora dos parametros normais!! Tente novamente");
                }
            } catch (NumberFormatException a) {

                if (y == null) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Você digitou errado!! Tente novamente");
                }

            }
        }

        return x;

    }

    /**
     *
     * @param texto Significa a mensagem que vai ser impressa ne tela
     * @param opcoesaceitaveis Significa as opções que serão aceitáveis como resposta
     * @return a String que foi digitada pelo usuário
     */
    public static String converssaoChar(String texto, String... opcoesaceitaveis) {

        boolean escreveuCerto = false;
        String stringRecebida = "valor inicial";
        String retorno = "";

        while (!escreveuCerto) {
            try {
                stringRecebida = JOptionPane.showInputDialog(texto);

                for (String s : opcoesaceitaveis) {

                    if (stringRecebida.equals(s)) {
                        retorno = stringRecebida;
                        escreveuCerto = true;
                        break;
                    }

                }

                if (!escreveuCerto) {
                    JOptionPane.showMessageDialog(null, "Você digitou errado!! Tente novamente");
                }

            } catch (Exception e) {
                if (stringRecebida == null) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Você digitou errado!! Tente novamente");
                }
            }
        }

        return retorno;
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        // DUVIDA: VARAIVEL APRESENTA COMO NÃO INICIALIZADA CASO NÃO DEFINA UM VALOR
        String nome;
        String tipoSanguineoERH;
        int idade = 0, resposta = 0;
        double peso = 0, altura = 0;
        boolean estaCorreto = false;

        // Loop para manter enquanto o usuário não confirmar suas informações, ou
        // cancelar
        while (!estaCorreto) {

            // Fazendo as perguntas com as caixas de mensagens
            nome = JOptionPane.showInputDialog("Digite o seu nome");
            idade = converssaoInt(0, 120, "Digite a sua idade");
            peso = converssaoDouble(30, 200, "Digite o seu peso");
            altura = converssaoDouble(0.4, 3, "Digite a sua altura");
            tipoSanguineoERH = converssaoChar("Digite o seu tipo sanguineo", "a+", "a-", "b+", "b-", "ab+", "ab-", "o+",
                    "o-");

            tipoSanguineoERH = tipoSanguineoERH.toUpperCase();

            // Perguntando se as informações dadas estão corretas
            resposta = JOptionPane.showConfirmDialog(null, "O nome é:" + nome + "\nA idade é:" + idade + "\nO peso é:"
                    + peso + "\nA altura é:" + altura + "\nO tipo sanguineo e fator RH são:" + (tipoSanguineoERH));

            // Condicionamento para se as informações estarem corretas informar o final
            if (resposta == 0) {
                estaCorreto = true;
                // Mensagem de conclusão
                JOptionPane.showMessageDialog(null,
                        "Os seus dados foram registrados como: \n" + "Nome: " + nome + "\nIdade : " + idade + "\nPeso: "
                                + peso + "\nAltura : " + altura + "\nTipo sanguineo e fator RH: "
                                + String.valueOf(tipoSanguineoERH));
            } else if (resposta == 2) {
                System.exit(0);
            } else if (resposta == 1) {
                if (JOptionPane.showConfirmDialog(null, "Deseja fornecer os dados novamente?") != 0) {
                    System.exit(0);
                }
            }

        }

    }

}
