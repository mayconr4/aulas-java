package Fase_05;

import java.util.Scanner;

public class TestandoPessoa {

	public static void main(String[] args) {
		
		String a,b,c;
		Pessoa pessoa = new Pessoa(); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digigte um nome: ");
		a = ler.next(); 
		pessoa.setNome(a);
		
		System.out.println("Digigte um telfone: ");
		b = ler.next();
		pessoa.setTelefone(b);
		
		System.out.println("Digigte um endreco: ");
		c = ler.next();
		pessoa.setEndereco(c);
		
		
		pessoa.mostrarPessoa(a, b, c);
		
		
		
		

	}

}
