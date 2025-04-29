import javax.swing.JOptionPane;

public class Exemplo_36 {

	public static void main(String[] args) {
		int num_01;
		int num_02; 
		
		String operacao;
		operacao = JOptionPane.showInputDialog("Digite a operação + ou -") ;  		
		num_01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um  numero: ")) ;
		num_02 = Integer.parseInt(JOptionPane.showInputDialog("Digite um  numero: "));
		
		calculadora(operacao,num_01,num_02);
	} 
	
	public static void calculadora(String op,int a , int b  ) { 
		int total;
		
		if(op.equals("+")) { 
			  total = a + b; 			  
			  JOptionPane.showMessageDialog(null, total);
		} else if (op.equals("-")){ 
			  total = a - b;  			  
			  JOptionPane.showMessageDialog(null, total);
		}
		else { 
			JOptionPane.showMessageDialog(null, "Digite novamente");
		}
		
	}

}
