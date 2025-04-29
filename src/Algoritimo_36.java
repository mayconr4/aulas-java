import javax.swing.*;

public class Algoritimo_36 {

    public static void main(String[] args){
        int num_01, num_02;
        int soma ;

        num_01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        num_02 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

        soma = (num_01)+(num_02);

        JOptionPane.showMessageDialog(null,"Primeiro Numero: "+num_01+"\nSegundo Numero: "+num_02+"\na soma destes numeros: "+soma);
    }
}
