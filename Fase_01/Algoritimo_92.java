import java.util.Scanner;

public class Algoritimo_92 {

	public static void main(String[] args) {
		int total, num_01, num_02;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite o numero: ");
		num_01 = ler.nextInt();
		
		System.out.println("Digite o numero: ");
		num_02 = ler.nextInt();
		
		total = num_01+num_02;
		
		if(total >20) {
			//total = total+8;
			total+=8;
			System.out.println("Total: "+total);
		} else {
			//total = total-5;
			total-=5;
			System.out.println("Total: "+total);
		}
		

	}

}
