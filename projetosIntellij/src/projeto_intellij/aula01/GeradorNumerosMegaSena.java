package projeto_intellij.aula01;

import javax.swing.JOptionPane;

public class GeradorNumerosMegaSena {

	public static void main(String[] args) {

		boolean estarodando = true;
		int resposta, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		JOptionPane.showInternalMessageDialog(null, "Bem vindo ao gerador de números da mega sena!!");

		while (estarodando) {


			resposta = JOptionPane.showConfirmDialog(null, "Gostaria de gerar os números da mega sena?");
			
			System.out.println(resposta);

			if (resposta == 0) {
				// pergunta variavel alterada no if, muda o else?
				// int to int[]

				n1 = (int) Math.round(Math.random() * 59) + 1;
				n2 = (int) Math.round(Math.random() * 59) + 1;
				n3 = (int) Math.round(Math.random() * 59) + 1;
				n4 = (int) Math.round(Math.random() * 59) + 1;
				n5 = (int) Math.round(Math.random() * 59) + 1;
				n6 = (int) Math.round(Math.random() * 59) + 1;

				JOptionPane.showInternalMessageDialog(null, "Os némeros gerados são:\n" + n1 + " | " + n2 + " | " + n3
						+ " | " + n4 + " | " + n5 + " | " + n6);

			//	resposta = JOptionPane.showConfirmDialog(null, "Gostaria de gerar mais números da mega sena?");
				if (resposta != 0) {
					JOptionPane.showInternalMessageDialog(null,
							"Obrigado por usar o nosso gerador de números da mega sena!!");
					estarodando = false;
				}

			} else {
				JOptionPane.showInternalMessageDialog(null,
						"Obrigado por usar o nosso gerador de números da mega sena!!");
				estarodando = false;
			}
		}

	}

}
