package Vetor;

public class Exemplo_03 {

	public static void main(String[] args) {
		int []a =  new int[25];
		int cont = 0;
		
		for(int i =0; i< a.length; i++) {
			if(i%2 != 0) { // se for impar ==1
				System.out.println("Numero: "+i);
				cont++;
			}
		}
		System.out.println("quantidade de numeros impares: "+cont);
	}

}
