import java.util.Scanner;

public class Algoritimo_101 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero >= 20 && numero <= 90) {
			System.out.println(numero+" Esta entre 20 e 90");
			
		}else {
			System.out.println(numero+" Não Esta entre 20 e 90");
		}
		
		

	}

}
