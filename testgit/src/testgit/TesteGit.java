package testgit;

import javax.swing.JOptionPane;

public class TesteGit {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas");
		
		double carronumero = Double.parseDouble(carros);
		double pessoanumero = Double.parseDouble(pessoas); 		
		
		int divisao = (int) (carronumero / pessoanumero);
		
		double resto = carronumero % pessoanumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado? " );
		
		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "Divis�o para pessoas deu " + divisao);
		}else {
			System.out.println("N�o quis ver o resultado!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o? ");
		if (resposta ==0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o eh: " + resto);
		}else {
			System.out.println("N�o quis ver o resultado!! ");
		}
				
		/*Deseja ver o resultado?*/
		System.out.println(resposta);
		
		JOptionPane.showMessageDialog(null, " Divis�o para pessoas deu " + divisao + " carros e sobrou " + resto + " carros " );
		
	}

}
