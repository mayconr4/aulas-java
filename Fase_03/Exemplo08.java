package Fase_03;

public class Exemplo08 {

	public static void main(String[] args) throws InterruptedException {
		String palavra = "paralelepipedo";
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print(palavra.charAt(i));
			Thread.sleep(1500);
		}

	}

}
