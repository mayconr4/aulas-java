package Calculadora;

import javax.swing.JOptionPane;

public class Calculo {
	
	public void somar () {
		int a , b, soma;
		 a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		 b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		soma = a+b; 
		
		JOptionPane.showMessageDialog(null,soma);
		
	} 
	
	
}
