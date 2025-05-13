package Vetor;

import java.util.Scanner;

public class Exemplo_05 {

	public static void main(String[] args) {
		int a, total, cont = 0;
		int []vetor = new int[11];  
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a tabuada");
		a = ler.nextInt();
		
		while (cont <= 10) {
			vetor[cont] = cont*a; 
			
			System.out.println(a+" x "+ cont+" = "+vetor[cont]);
			cont++;
		} 
		 
		
		/* exemplo de como  percorre um vetor com o loop wihle
		while(cont<vetor.length) {
			System.out.println(vetor[cont]);
			cont++;
		}
		System.out.println(vetor[3]);
		*/
		
	}

}
