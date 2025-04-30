
import javax.swing.JOptionPane;

public class Exemplo_01 {

	public static void main(String[] args) {
    String op;
    double numero01, numero02, total;

    numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
    numero02 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
    op=JOptionPane.showInputDialog("Digite a operação");

    if (op.equals("+")) {
        total = numero01+numero02;
        JOptionPane.showMessageDialog(null, total);
    } else if(op.equals("-")){
        total = numero01-numero02;
        JOptionPane.showMessageDialog(null, total);
    } else if(op.equals("*")){
        total = numero01*numero02;
        JOptionPane.showMessageDialog(null, total);
    } else if(op.equals("/")){
        total = numero01/numero02;
        JOptionPane.showMessageDialog(null, total);
    } else {
        JOptionPane.showMessageDialog(null, "Operação inválida");
    }
    
    }

}