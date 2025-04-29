import javax.swing.JOptionPane;

public class Exemplo_37 {

	public static void main(String[] args) {
		int num = 50;
		int retorno;
		
		System.out.println("Primeiro exemplo");
		retorno = numero();
		somar(retorno,num);
		
		System.out.println("Segundo exemplo: "); 
		somar(numero(),num); //Chamando métodos / metodo dentro de outro método
		

	} 
	
	public static int numero() { 
		int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		return num1;
	} 
	
	public static void somar(int a, int b) {
		int soma = a+b;
		JOptionPane.showMessageDialog(null,soma);
		
	}

}
