import java.util.Scanner;

public class Algoritimo_93 {

	public static void main(String[] args) {
		double a, total;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero: ");
		a = ler.nextDouble();
		
		if(a >= 0) {
			total = Math.sqrt(a);
			System.out.println("total Com raiz quadrada: "+total);
		} else {
			total = Math.pow(a, 2);
			System.out.println("total com exponienciação "+total);
		}

	}

}
