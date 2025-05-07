package Fase_03;

import javax.swing.JOptionPane;

public class Exemplo4j {

	public static void main(String[] args) throws InterruptedException {
		int a,cont=1,total;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		
		while (cont <=10) {
			total = a*cont;
			JOptionPane.showMessageDialog(null, a+" X "+cont+" : "+total);
			Thread.sleep(1500);
			cont++;
		}

	}

}
