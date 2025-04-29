
import javax.swing.JOptionPane;

public class Algoritimo_41 { 

    public static void main(String[] args) { 
        double num_01, num_02, num_03, num_04, total, soma;

        num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        num_03 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")); 
        num_04 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));

       

        soma = ((num_01*1)+(num_02*2)+(num_03*3)+(num_04*4));
        total = soma/10;

        JOptionPane.showMessageDialog(null, "O total é:"+total);




    }

}