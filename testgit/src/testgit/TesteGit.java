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
		
		JOptionPane.showMessageDialog(null, " Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros " );
		
	}

}
