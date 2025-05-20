package Fase_05;

public class Calculo {
	private double num_01,num_02;
	
	public double getNum_01() { 
		
		return num_01;
	} 
	
	public double getNum_02() { 
		
		return num_02;
	} 
	
	public void setNum_01(double a) { 
		this.num_01 = a;
	} 
	
	public void setNum_02(double b) { 
		this.num_02 = b;
	}
	
	public void somar(double a, double b) {
		double total = a+b;
		System.out.println("Total: "+total);
	} 
	
	public void somar(double a, double b, double c) {
		double total = a+b+c;
		System.out.println("Total: "+total);
	} 
	
	public void somar(double a, double b, double c , double d) {
		double total = a+b+c+d;
		System.out.println("Total: "+total);
	}
}
