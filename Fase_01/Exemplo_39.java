import java.util.Random;

public class Exemplo_39 {

	public static void main(String[] args) {
		int a = Math.abs(800);
		System.out.println("Absoluto: "+a);
		
		
		int maior = Math.max(10, 6);
		System.out.println("Menor: "+maior); 
		
		int menor = Math.min(7, 9);
		System.out.println("Maior: "+menor);
		
		double potencia = Math.pow(5,2);
		System.out.println("Potencia "+potencia); 
		
		double raiz = Math.sqrt(16);
		System.out.println("Raiz quadrada: "+raiz);
		
		double arrendondar = Math.ceil(4.3);
		System.out.println("Arrendondar para cima : "+arrendondar);
		
		double arrendondar01 = Math.floor(4.5);
		System.out.println("Arrendondar para baixo: "+arrendondar01);
		
		double arrendondar02 = Math.round(4.3);
		System.out.println("Arrendondar: "+arrendondar02);
		
		double aleatorio =  Math.random();
		System.out.println("Aleatorio: "+aleatorio);
				
		Random rand = new Random(); 
		int aleatorio02 = rand.nextInt();
		System.out.println("Aleátorio 02: "+aleatorio02);
		
	}

}
