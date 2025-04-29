import javax.swing.JOptionPane;

public class Exemplo_38 {

	public static void main(String[] args) {
		int soma; 
		int subtracao;
		int multiplicacao;
		int divisao;// Criando um atributo para receber os métodos
		
		int valorUm ;
		int valorDois;
		
		soma = somar(valor01(), valor02());
		JOptionPane.showMessageDialog(null, soma);
		
		subtracao = subtrair(valor01(), valor02());
		JOptionPane.showMessageDialog(null,subtracao);
		
		multiplicacao = multiplica(valor01(), valor02());
		JOptionPane.showMessageDialog(null, multiplicacao);
		
		divisao = divisa(valor01(), valor02());
		JOptionPane.showMessageDialog(null, divisao);
		
	}
	
	public static int valor01() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		return numero; 
	}  
	
	public static int valor02() { 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		return numero;
	}
	
	public static int somar(int a , int b) {
		int total = a +b; 		
		return total;
	} 
	
	public static int subtrair(int a, int b) { 
		int total = a-b;
		return total;
	}
	
	public static int multiplica(int a , int b) { 
		int total = a*b;
		return total;
		
	}
	
	public static int divisa(int a , int b) { 
		int total = a/b;
		return total;
	}
	
	
}
