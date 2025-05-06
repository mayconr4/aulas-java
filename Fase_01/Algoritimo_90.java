import java.util.Scanner;

public class Algoritimo_90 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
	
		if (numero > 20){ 
			System.out.println("Numero Digitado: "+numero);
		} else {
			System.out.println("tente novamente: ");
		}

	}

}
