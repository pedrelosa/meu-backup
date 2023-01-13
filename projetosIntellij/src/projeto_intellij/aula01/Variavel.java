package projeto_intellij.aula01;

public class Variavel {

	public static void main(String[] args) {
		final double IMPOSTO_ICMS = 0.18;

		// String não é um tipo primitivo
		String nome = "Pedro";
		nome += "Elo";

		// Tipos primitivos:
		int idade = 17;

		float peso = 95.3f;

		double altura = 1.80;

		boolean ehDoadorDeSangue = false;

		char tipoSanguineo = 'O';

		char fatorRH = '-';
		
		char x = 'b';
		String y = "abcdef";
		
		char[] opcoesaceitaveis = {'a', 'b', 'c'};
		
		for(int n = 0; n< y.length() ; n++) {
			x = y.charAt(n);
			System.out.println(n);
			
			for(int h = 0; h < opcoesaceitaveis.length; h++) {
				if(x == opcoesaceitaveis[h]) {
					System.out.println("Deu bom");
				}
			
			}
		}
		
		
		

//		System.out.println("O nome é:" + nome);// %s
//		System.out.println("A idade é:" + idade);// %d
//		System.out.println("O peso é:" + peso);// %f
//		System.out.println("A altura é:" + altura);// %f
//		System.out.println("Ele é doador de sangue:" + ehDoadorDeSangue);// %b
//		System.out.println("O tipo sanguineo e fator RH são:" + tipoSanguineo + fatorRH);// %c

	}

}
