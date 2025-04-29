//Entrar com uma data no forato ddmmaa e imprimir: dia mes e ano 

import javax.swing.JOptionPane;

public class Exemplo14 {

	public static void main(String[] args) {
		int data, dia, mes,ano;
		
		data = Integer.parseInt(JOptionPane.showInputDialog("Digie a data no formato ddmmaa:"));
		dia = data/10000;
		mes = data%10000/100;
		ano = data%100;
		System.out.println("\n Dia: "+dia+"\nMes:"+mes+"\nAno: "+ano);
		
		
		 
	}

}
