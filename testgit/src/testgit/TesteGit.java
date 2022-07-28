package testgit;

import javax.swing.JOptionPane;

public class TesteGit {
	public static void main(String[] args) {
		
		
		
		
<<<<<<< master
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1:");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2:");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3:");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4:");
		
		double nNota1 = Double.parseDouble(nota1);
		double nNota2 = Double.parseDouble(nota2);
		double nNota3 = Double.parseDouble(nota3);
		double nNota4 = Double.parseDouble(nota4);
		
		double media = (nNota1 + nNota2 + nNota3 + nNota4) / 4;
		
		if (media >= 5) {
			
			if (media >= 7) {
				JOptionPane.showMessageDialog(null, "A media é: " + media + " Aprovado!!! ");
			}else {
				JOptionPane.showMessageDialog(null, " A media é: " + media + " Você está de recuperação! ");
			}
		}else {
			JOptionPane.showMessageDialog(null, " A media é: " + media + " Você Reprovou, que pena.. ");
		}
					
				
=======
		JOptionPane.showMessageDialog(null, " Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros " );
		
>>>>>>> bd619cc Aula 8.12 testada ok!!
	}

}
