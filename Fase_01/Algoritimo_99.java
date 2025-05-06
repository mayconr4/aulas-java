import java.util.Scanner;

public class Algoritimo_99 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		int centenas, numero;  // algoritimo para ler a terceira casa decimal e informa se é par ou impar
		
		System.out.println("Digite um numero inteiro de 3 digitos: ");
		numero = ler.nextInt();
		
		centenas = numero /100;
		
		if (centenas % 2 == 0) {
			System.out.println("o algarismo das centenas  ("+ centenas + ") é PAR.");
		} else { 
			System.out.println("o algarismo das centenas  ("+ centenas + ") é IMPAR.");
		}
		
	}

}
