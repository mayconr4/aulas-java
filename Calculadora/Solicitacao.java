package Calculadora;

import javax.swing.JOptionPane;

public class Solicitacao {
	
	public static void Solicitar() { 
		
		Calculo calc = new Calculo(); // Para metodos não são (static) usamos objeto
		String op;
		op = JOptionPane.showInputDialog("Digite a Operação: ");
		
		if (op.equals("+")) {
			calc.somar();
		} else if (op.equals("-")) {
			calc.sub();
		} else if (op.equals("*")) { 
			calc.multiplicacao();
			
		} else if (op.equals("/")) {
			calc.divisao();
		}else {
			JOptionPane.showMessageDialog(null,"Operação inválida");
		}
	}
	
}
