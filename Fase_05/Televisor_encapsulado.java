package Fase_05;

public class Televisor_encapsulado {

	private int canal;
	private int volume; 
	
	public Televisor_encapsulado() { 
		
	} 
	public Televisor_encapsulado(int volume) {
		this.volume = volume;
	} 
	
	public Televisor_encapsulado(int volume,int canal) {
		this.volume = volume;
		this.canal = canal;
	} 
	
	
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		
		try {
			if(volume >= 0 && volume <= 100) {
				this.volume = volume; 
				
			} else {
				System.out.println("Volume fora da faixa permitida");
			}
			
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
	}
	
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		
		if (canal >=0 && canal <= 1000) {
			this.canal = canal; 			
			
		}
	
	} 
	
	public void aumentarVolume() { 
		if(volume <100) {
			volume ++;
		}
	}
	
	public void diminuirVolume() {
		if(volume > 0) {
			volume --;
		}
	}
	
	public void aumentarCanal() { 
		if(canal<1000) {
			canal++;
		}
	} 
	
	public void diminuirCanal() {
		if(volume>0) { 
			canal --;
		}
	} 
	
	public void mostrar() { 
		System.out.println("Volume: "+getVolume()+"\nCanal: "+getCanal());
	}
	
	
	
}
