import javax.swing.JOptionPane;

public class Exemplo_34 {

	public static void main(String[] args) {
		
		
		somar();
	}
	
	//Criando um método vazio   	
	
	public static void somar() { 
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		 int somar = a+b;
		 
		 System.out.println(somar);
		
	}

}
