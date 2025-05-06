import java.util.Scanner;

public class Algoritimo_102 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digte um numero: ");
		numero = ler.nextInt();
		
		if(numero >20  ) {
			System.out.println("maior que 20");
		} else if(numero == 20) {
			System.out.println("igual que 20");
		} else {
			System.out.println("menor que 20");
		}

	}

}
