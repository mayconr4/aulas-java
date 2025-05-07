package Fase_03;

import java.util.Scanner;

public class Algoritimo_262 {
	public static void main(String[] args) {
	
		int contador, num, triplo;
		String resposta;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero");
		num = ler.nextInt();
		
		
		
		while (true) { 
			triplo = num*3;
			if(num == -999) {
				break;
			}else { 				
				System.out.println(triplo); 
				
			} 
			System.out.println("Digite um numero");
			num = ler.nextInt();     
			
		} 
		System.out.println("fim da aplicação: ");
		
	}

}
