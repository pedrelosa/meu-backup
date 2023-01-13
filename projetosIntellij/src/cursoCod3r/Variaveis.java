package cursoCod3r;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {
        String s = "Bom dia X";
        System.out.println(s);

        s = s.toUpperCase();// retorna todas as letras maiúsculas;
        System.out.println(s);

        s = s.toLowerCase();// retorna todas as letras minusculas;
        System.out.println(s);

        s = s.replace("x", "Roberto");// subistitui uma parte
        // da string por uma que voçê define
        System.out.println(s);

        s = s.concat(", como foi o seu dia?");// concatena uma string
        System.out.println(s);

        System.out.println(s.length());// retorna o tamanho da string

        System.out.println(s.charAt(3));// retrona um char referente ao
        // indice passado como parametro

        System.out.println(s.repeat(2));// retorna a string repetida
        // quantas vezes for requerida
        System.out.println();//pulando linha

        {//transforma os caracteras em codePoints(númeos da tabela ascii)
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.codePointAt(i)+"|");
            }
            System.out.println();// pulando linha

            /*variações:
            *
            * s.codePointBefore()
            * Retorna o caractere (ponto de código Unicode) antes do
            *  índice especificado. O índice refere-se a valores char
            * (unidades de código Unicode) e varía de 1 o comprimento.
            * Se o valor char em (index - 1) estiver no intervalo de baixo
            * substituto, (index - 2) não for negativo e o valor char em
            * (index - 2) estiver no intervalo de alto substituto, então o
            * ponto de código suplementar valor do par substituto é retornado.
            * Se o valor char no índice - 1 for um substituto baixo não
            * pareado ou um substituto alto, o valor substituto será retornado.
            *
            * s.codePoints()
            * Retorna um fluxo de valores de ponto de código dessa sequência.
            *  Quaisquer pares substitutos encontrados na sequência são
            * combinados como se por Character.toCodePoint e o resultado é
            * passado para o fluxo. Quaisquer outras unidades de código,
            * incluindo caracteres BMP comuns, substitutos não emparelhados
            * e unidades de código indefinidas, são estendidas com zero para
            * valores int que são passados para o fluxo.
            *
            * s.codePointCount()
            * Retorna o número de pontos de código Unicode no intervalo de
            * texto especificado desta String. O intervalo de texto começa no
            * beginIndex especificado e se estende até o char no índice
            * endIndex - 1 . Portanto, o comprimento (em char s) do intervalo
            * de texto é endIndex-beginIndex . Substitutos não pareados dentro
            * do intervalo de texto contam como um ponto de código cada.
            *
            * */

        }

        System.out.println(s.contains("como"));// retorna true caso a string
        // contenha o texto passado como parametro

        System.out.println(s.equals("bom dia roberto, como foi o seu dia?"));
        // retorna true caso a string passada como parametro for estritamente igual

        System.out.println(s.equalsIgnoreCase("bom dia roberto, como foi o seu dia?"));
        // retorna true caso a string passada como parametro for igual
        // independente se for maiusculo ou minusculo

        {
            // separa a string por caracteres que você definir, pode definir um limite
            String str = "091@342@9083";
            String[] arrOfStr = str.split("@");

            for (String a : arrOfStr)
                System.out.println(a);
        }

        {
            // removing leading and
            // trailing white spaces
            System.out.println("    "+s.strip()+"    ");

            // removing leading white spaces
            System.out.println("    "+s.stripLeading()+"    ");

            // removing trailing white spaces
            System.out.println("    "+s.stripTrailing()+"    ");
        }

    }

}
