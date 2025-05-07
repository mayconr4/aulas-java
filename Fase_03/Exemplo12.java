package Fase_03;

import java.util.Arrays;
import java.util.List;

public class Exemplo12 {

	public static void main(String[] args) throws InterruptedException {
		
		List<String> frutas = Arrays.asList("Maçã","Banana","Laranja","Uva");
		
		for (String fruta : frutas) {
			System.out.println("Fruta: "+fruta);
			Thread.sleep(1500);
		}

	}

}
