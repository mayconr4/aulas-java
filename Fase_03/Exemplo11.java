package Fase_03;

public class Exemplo11 {

	public static void main(String[] args) throws InterruptedException {
		
		int minuto,segundo;
		
	for (int hora = 0; hora < 24; hora++) {
		
		for (minuto = 0; minuto < 60; minuto++) {
			for (segundo = 0; segundo < 60; segundo++) {
				
				System.out.println(hora+":"+minuto+":"+segundo);
				Thread.sleep(-50);
	}
			}
		}

	}

}
