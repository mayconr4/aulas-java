import java.util.Scanner;

public class Algoritimo_98 {

	public static void main(String[] args) {
		
		double salarioBruto, valorPrestacao, porcentagemSalario;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digte o seu salário bruto: ");
		salarioBruto = ler.nextDouble();
		
		System.out.println("Digte o valor da sua prestação: ");
		valorPrestacao = ler.nextDouble(); 
		
		porcentagemSalario = (salarioBruto/100)*30;
		
		if (porcentagemSalario <= valorPrestacao) {
			System.out.println(" pode ser realizado o emprestimo");
			
		}	else { 
			System.out.println("não pode ser realizado o emprestimo");
		}
		
		
		

	}

}
