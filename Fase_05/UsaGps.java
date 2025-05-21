package Fase_05;

public class UsaGps {

	public static void main(String[] args) {
		Gps gps = new Gps();
		String a,b;
		
		a = gps.definirIdioma();
		b = gps.definirRota();
		gps.mostrar(a,b);
		

	}

}
