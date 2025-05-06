import java.util.Scanner;

public class Algoritimo_96 {

	public static void main(String[] args) {
		int a; 
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digie um numero: ");
		a  = ler.nextInt();
		
		if (a%3==0 && a%7==0) { 
			System.out.println("é divisivel por 3 e 7");
			
		}else {
		
			System.out.println("não é divisivel por 3 e 7");
		}

	}

}
