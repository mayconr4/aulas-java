import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String nome ;
    int idade = 17;
    String telefone = "(11) - 97504-0149";

    System.out.println(telefone);
    System.out.println(idade);
    // System.out.println(nome);



        Scanner ler = new Scanner(System.in); // Criando um Objeto com a Funcionalidade de um inout

        System.out.println("Digite um texto");
        nome = ler.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();

        System.out.println("Digite o seu telefone: ");
        telefone = ler.nextLine();


        System.out.println("Nome: "+nome);
        System.out.println("Digite a sua idade: "+idade);
        System.out.println("Digite O seu telefone: "+telefone);

        ler.close(); // Boa Pratica



    }
}