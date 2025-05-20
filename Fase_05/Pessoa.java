package Fase_05;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome; 
	private String telefone;
	private String endereco;
	
	public String getNome() { 
		
		return nome;
	} 
	
	public String gettelefone() { 
		
		return telefone;
	} 
	
	public String getEndereco() { 
		
		return endereco;
	} 
	
	public void  setNome(String n) { 
		
		this.nome = n;
	} 
	
	public void setTelefone(String t) {
		
		this.telefone = t;
	} 
	
	public void setEndereco(String e) { 
		
		this.endereco = e;
	} 
	
	 
	public void mostrarPessoa(String a, String b, String c) { 
		System.out.println("Nome"+nome+"\ntelefone: "+telefone+"\nendereco: "+endereco);
		
	}
	

}
