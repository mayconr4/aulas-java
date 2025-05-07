package Fase_03;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		String resp;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 's' se for continuar");
		resp = ler.next();
		
		while (true) {
			
			if(resp.equals("s")) {
				
			} else {
				System.out.println("Fim da operação");
				break;
			}
			
			System.out.println("Digite 's' se for continuar ");
			resp = ler.next();
		}
	}
}