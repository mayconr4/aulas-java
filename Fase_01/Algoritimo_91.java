import java.util.Scanner;

public class Algoritimo_91 {

	public static void main(String[] args) {
		int a,b ,total;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite o numero: ");
		a = ler.nextInt();
		
		System.out.println("Digite o numero: ");
		b = ler.nextInt();
		
		total = a+b;
		
		if(total >10) {
			System.out.println("Total: "+total);
		} 

	}

}
