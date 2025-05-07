package Fase_03;

public class Exemplo_14 {

	public static void main(String[] args) throws InterruptedException {
		int[] numeros = {1,2,3,4,5};
		
		//Laço for resultado para percorrer o array 
		
		for (int num : numeros) { 
			System.out.println("Numero: "+ num);
			Thread.sleep(1500);
			
		}

	}

}
