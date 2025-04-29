import javax.swing.*;

public class Algoritimo_39 {
    public static void main(String[] args){
    double num_01, num_02, media;

    num_01 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real: "));
    num_02 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real: "));

    media = (num_01 +num_02)/2;

    JOptionPane.showMessageDialog(null,"Numero 1 :"+num_01+"\nNumero 2 : "+num_02+"\nMédia Aritimética: "+media);

    }
}
