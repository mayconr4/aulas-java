import javax.swing.*;

public class Algoritimo_35 {

    public static void main(String[] args){
        String nome, endereco, telefone;

        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        endereco = JOptionPane.showInputDialog("Digite o seu endereco: ");
        telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");

        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nendereço: "+endereco+"\ntelefone: "+telefone);


    };
}
