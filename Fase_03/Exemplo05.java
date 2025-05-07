package Fase_03;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) throws InterruptedException {
		int a, cont=1,total, acm=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a tabuada!!");
		a=ler.nextInt();
		
		while(cont <= 10) {
			total = a*cont;
			System.out.println(a+" X "+cont+" : "+total);
			Thread.sleep(1500);
			acm+=total;
			cont++;
			
		}
		System.out.println("Total acumulado"+acm);

	}

}
