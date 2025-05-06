import java.util.Scanner;

public class Algoritimo_94 {

	public static void main(String[] args) {
		int numero, conta; 
		
		Scanner ler = new Scanner(System.in); 
		System.out.println("Digite um numero");
		numero = ler.nextInt();
		
		
		
		if (numero%3==0) { //Verificando se se sobr aalgum resto na multiplicação
			System.out.println("è multiplo de 3 o "+numero);
			
		} else {
			System.out.println("Não é multiplo de 3: ");
		}
		
		

	}

}
