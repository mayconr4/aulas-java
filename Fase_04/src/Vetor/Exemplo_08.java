package Vetor;

public class Exemplo_08 {

	public static void main(String[] args) {
		int [] vetor = {10,20,30,40};
		int valorProcurado = 3;
		boolean encontrado = false;
		
		for (int num : vetor) { // O ":" serve para analisar separadamente 
			if(num == valorProcurado) { 
				encontrado = true;
				break;
			}
		}
		System.out.println("Valor encontrado? "+ encontrado); 
		
	}

}
