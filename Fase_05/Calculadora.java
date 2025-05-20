package Fase_05;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		Scanner ler = new Scanner (System.in);
		double a;
		
		System.out.println("Digite um número: ");
		a=ler.nextDouble();
		calculo.setNum_01(a);
		
		System.out.println("Digite um número: ");
		a=ler.nextDouble();
		calculo.setNum_02(a);
		
		double valor = 10;
		
		calculo.somar(calculo.getNum_01(), calculo.getNum_02(), valor);

	}

}
