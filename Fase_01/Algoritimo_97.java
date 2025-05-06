import java.util.Scanner;

public class Algoritimo_97 {

	public static void main(String[] args) {
		int a;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero qualquer ");
		a = ler.nextInt();
		
		if(a%10==0 && a%5==0 && a%2==0) {
			System.out.println("è divisivel por 10 5 e 2");
		} else { 
			System.out.println("não é ");
			
		}

	}

}
