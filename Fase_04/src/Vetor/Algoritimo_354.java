package Vetor;

public class Algoritimo_354 {

	public static void main(String[] args) {
		int []numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		int cont = 1;
		
		
		for(; cont< numeros.length; cont++) {
			if(numeros[cont]%2 != 0) { // se for impar ==1
				System.out.println("Par: "+cont);
				//cont++;
			} else if(numeros[cont]%2 != 1) {
				System.out.println("Impar: "+cont);
				//cont++;
			}
		}
		
	}

}
