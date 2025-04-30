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

	public void sub (){
		int a , b, subtracao;
		 a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		 b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		subtracao = a-b;

		JOptionPane.showMessageDialog(null, subtracao);
	}
	
	public void multiplicacao (){
		int a , b, multiplica;
		 a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		 b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		multiplica = a*b;

		JOptionPane.showMessageDialog(null, multiplica);
	}

	public void divisao (){
		int a , b, dividir;
		 a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		 b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		dividir = a/b;

		JOptionPane.showMessageDialog(null, dividir);
	}
	
	
}
