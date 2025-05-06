import java.util.Scanner;

public class Algoritimo_100 {

	public static void main(String[] args) {
		int numero, centenas, milhar ;
		
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero com 4 digitos");
		numero = ler.nextInt();
		
		
		milhar = numero / 1000;
		
		if (  milhar %4==0) {
			System.out.println("São multiplo de quatro");
		} else {
			System.out.println("Não São multiplo de quatro");
		}

	}

}
