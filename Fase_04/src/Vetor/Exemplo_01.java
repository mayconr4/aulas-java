package Vetor;

public class Exemplo_01 {

	public static void main(String[] args) {
		int []vetor_01 = new int[3]; //declarando as posições = 0,1,2
		
		for(int i =0; i <vetor_01.length; i++) {
			    
			vetor_01[i] += i; //cria vetor de escopo não global 
			System.out.println("Valor da posição: "+vetor_01[i]+" Posição: "+i);
		}
	}

}
