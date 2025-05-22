package Fase_05;

import java.util.Scanner;

public class UsaGps {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Gps gps = new Gps("ingles", "Inglaterra");
		gps.mostrar();


		System.out.println("Digite o idioma predefinido");
		gps.idioma = ler.nextLine();

		System.out.println("Digite a arota do destino");
		gps.rota = ler.nextLine();

		gps.mostrar();



	}

}
