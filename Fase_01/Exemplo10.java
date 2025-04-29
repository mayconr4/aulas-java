import java.util.Scanner;

public class Exemplo10 {

	public static void main(String[] args) {
		float peso;
		float altura;
		int quadrado = 2; 
		double imc; 
		double divisao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		peso = ler.nextFloat(); 
		
		System.out.println("Digite a  sua altura: ");
		altura = ler.nextFloat(); 
		
		imc = peso/(altura * quadrado);
		System.out.println("Seu Imc total é: "+imc);
		
		

	}

}
