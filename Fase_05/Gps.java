package Fase_05;

public class Gps {
	
	 public String idioma;
	 public String rota;
	 

	 
	 public  Gps() { }
	 
	 public Gps(String idioma, String rota) {
		 idioma = "ingles";
		 rota = "inglaterra";

		 this.idioma = idioma ;
		 this.rota = rota;
	 }

	 public void definirIdioma(String a ) {
		 
		 this.idioma = a ;
	 }
	 
	 public void definirRota(String b ) {
		 
		 this.rota = b; 
	 }

	 public void mostrar(){
		 System.out.println("Rota: "+this.rota+"\nIdioma: "+this.idioma);
	 }
	
	 
	 
	 
	 
	 

}
