package Vetor;

import java.util.Scanner;

public class Exemplo_02 {

	public static void main(String[] args) {
		int a;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite a quantidade de posições");
		a=ler.nextInt(); 
		
		int[] vetor= new int [a];
		
		for(int i=0;i < vetor.length; i++ ) {
			
			
			System.out.println("posição: "+i);
			
		}
	}

}
