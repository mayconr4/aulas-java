package Fase_03;

public class Exemplo_13 {

	public static void main(String[] args) throws InterruptedException {
		String palavra = "paralelepido";
		
		for(char letra : palavra.toCharArray()) {
			System.out.println("letra: "+letra);
			Thread.sleep(1000);
		}

	}

}
