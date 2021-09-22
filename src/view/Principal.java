package view;

import br.edu.fateczl.katia.pilhaString.Pilha;
import controller.ControllerPalindromo;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ControllerPalindromo ctrPalindromo = new ControllerPalindromo();
		Pilha pilha = new Pilha();
		
		String palavra;
		String palavraInvertida;
		
		palavra = JOptionPane.showInputDialog(null, "Digite uma Palavra: ");
		palavraInvertida = ctrPalindromo.invertePalavra(palavra, pilha);
		
		if (ctrPalindromo.palindromo(palavra, palavraInvertida)) { // se palindromo verdade
			
			JOptionPane.showMessageDialog(null, "A palavra " + palavraInvertida + " é palíndroma!!!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " não é palíndroma!!!");
			
		}
		
	}

}
