package Fase_03;

import javax.swing.JOptionPane;

public class Exeplo01 {

	public static void main(String[] args) throws InterruptedException  {
		int cont = 0;
		
		while (cont <= 5) {
			System.out.println( "Volta: "+cont);
			Thread.sleep(1500);
			cont++;
		}
		
		System.out.println("Volta concluida");

	}

}
