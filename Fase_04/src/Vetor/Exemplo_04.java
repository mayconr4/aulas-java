package Vetor;

import java.util.Scanner;

public class Exemplo_04 {

	public static void main(String[] args) {
		int a=9, total;
		int []vetor = new int[11]; 
		
		Scanner ler = new Scanner(System.in);
		
		
		for(int i=0; i <vetor.length; i++) {
			vetor[i] = i*a;
			
		} 
	
		
		for(int i=0; i <vetor.length; i++) {
			System.out.println(i+" x "+a+" : "+vetor[i]);
			
		}
	}

}
