import javax.swing.JOptionPane;

public class Exemplo13 {

	public static void main(String[] args) {
		int numero,dezena;
		
		// transformando o JOptionpane em inteiro 
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de tres casa decimais"));
		dezena = (numero/10)%10;
		System.out.println("Algarismos da casa das dezenas: "+dezena);

	}

}
