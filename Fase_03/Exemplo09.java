package Fase_03;

public class Exemplo09 {

	public static void main(String[] args) throws InterruptedException {
		int [][]matriz = new int [3][3];

		for (int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz.length; j++) {
				
				System.out.println(i+" "+j);
				Thread.sleep(1500);
			}
					
		}
	}

}
