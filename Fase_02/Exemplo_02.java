
import javax.swing.JOptionPane;

public class Exemplo_02 {

	public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade")) ;

        if (idade == 15){ 
            JOptionPane.showMessageDialog(null, idade+"sua idade foi aprovada");
        }   else{ 
            JOptionPane.showMessageDialog(null,"Sua idade foi reprovada: "+idade);
        }

    }}