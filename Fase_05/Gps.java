package Fase_05;

public class Gps {
	
	 public String idioma;
	 public String rota;
	 
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	 
	 public  Gps() { 		 
		 
		 
	 } 
	 
	 
	 public Gps(String idioma, String rota) { 
		 idioma = "Português";
		 rota = "senac Penha";
		 
		 this.idioma = idioma ;
		 this.rota = rota; 
	 }   
	 
	 public void mostrar(String a, String b) { 
		 System.out.println("idioma: "+rota);
		   
		 System.out.println("rota: "+idioma);
		 
		 
	 } 
	 
	 public void definirIdioma(String a ) {
		 
		 this.idioma = a ;
	 }
	 
	 
	 public void definirRota(String b ) {
		 
		 this.rota = b; 
	 }
	
	 
	 
	 
	 
	 

}
