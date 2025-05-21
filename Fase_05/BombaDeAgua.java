package Fase_05;

public class BombaDeAgua { 
	
	private boolean  status;  
	
	
	public void Ligar() { 
		 status = true;
		 for (int segundo = 5; segundo > 0; segundo--) {
				
				System.out.println("tempo para desligar: "+segundo);
				try { 
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					
					e.printStackTrace();
				}
				
		 } 
	} 
	
	public void Desligar() { 
		status = false;
		System.out.println("Bomba desligada: ");
	}  
	
	
	
	
	
	
	
	
	
	
	
	

}
