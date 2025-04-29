import javax.swing.*;

public class Algoritimo_34 {

    public static void main(String[] args){
        int num_01;
        int antecessor;
        int sucessor ;

        num_01 = Integer.parseInt(JOptionPane.showInputDialog("Digigte  numero inteiro: "));
        antecessor = (num_01)++;
        sucessor = (num_01)--;
        JOptionPane.showMessageDialog(null,"Antecessor: "+antecessor+"\nSucessor:"+sucessor);  

    };
}
