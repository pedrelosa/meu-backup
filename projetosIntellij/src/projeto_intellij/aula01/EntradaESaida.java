package projeto_intellij.aula01;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("O nome é?");// %s
		String nome = leitor.nextLine();
		System.out.println("A idade é?");// %d
		int idade = leitor.nextInt();
		System.out.println("O peso é?");// %f
		double peso = leitor.nextDouble();
		System.out.println("A altura é?");// %f
		double altura = leitor.nextDouble();
		System.out.println("O tipo sanguineo e fator RH são?");// %c
		String tiposangerh = leitor.next();

		System.out.println("O nome é:" + nome);// %s
		System.out.println("A idade é:" + idade);// %d
		System.out.println("O peso é:" + peso);// %f
		System.out.println("A altura é:" + altura);// %f
		System.out.println("O tipo sanguineo e fator RH são:" + tiposangerh);// %c

		leitor.close();

	}

}
