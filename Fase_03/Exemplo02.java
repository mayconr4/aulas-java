package Fase_03;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		String resp = null;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 's' se for continuar");
		resp = ler.next();
		
		while (true) {
			
			if(resp.equals("s")) {
				System.out.println("Fim da operação");
				break;
			}
			
			System.out.println("Digite 's' se for continuar ");
			resp = ler.next();
		}
	}
}