import javax.swing.*;

public class Algoritimo_37 {
    public static void main(String[] args){
        int num_01,num_02,produto;


        num_01 = Integer.parseInt(JOptionPane.showInputDialog("Digiteu numero"));
        num_02 = Integer.parseInt(JOptionPane.showInputDialog("Digiteu numero"));
        produto = num_01*num_02;

        JOptionPane.showMessageDialog(null,"O prduto destes numeros: "+produto);


    }

}
